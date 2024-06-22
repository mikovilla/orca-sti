using _10PERFTASK.Models;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Web.Mvc;

public class ProductsController : Controller
{
    private string connectionString = System.Configuration.ConfigurationManager.ConnectionStrings["DefaultConnection"].ConnectionString;

    public ActionResult Index()
    {
        List<Product> products = new List<Product>();

        using (SqlConnection conn = new SqlConnection(connectionString))
        {
            SqlCommand cmd = new SqlCommand("SELECT * FROM Products", conn);
            conn.Open();
            SqlDataReader reader = cmd.ExecuteReader();

            while (reader.Read())
            {
                products.Add(new Product
                {
                    ProductID = reader.GetInt32(0),
                    ProductName = reader.GetString(1),
                    Brand = reader.GetString(2),
                    Price = reader.GetDecimal(3)
                });
            }
        }

        return View(products);
    }

    public ActionResult Create()
    {
        return View();
    }

    [HttpPost]
    public ActionResult Create(Product product)
    {
        using (SqlConnection conn = new SqlConnection(connectionString))
        {
            SqlCommand cmd = new SqlCommand("INSERT INTO Products (ProductName, Brand, Price) VALUES (@ProductName, @Brand, @Price)", conn);
            cmd.Parameters.AddWithValue("@ProductName", product.ProductName);
            cmd.Parameters.AddWithValue("@Brand", product.Brand);
            cmd.Parameters.AddWithValue("@Price", product.Price);

            conn.Open();
            cmd.ExecuteNonQuery();
        }

        return RedirectToAction("Index");
    }

    public ActionResult Edit(int id)
    {
        Product product = null;

        using (SqlConnection conn = new SqlConnection(connectionString))
        {
            SqlCommand cmd = new SqlCommand("SELECT * FROM Products WHERE ProductID = @ProductID", conn);
            cmd.Parameters.AddWithValue("@ProductID", id);
            conn.Open();
            SqlDataReader reader = cmd.ExecuteReader();

            if (reader.Read())
            {
                product = new Product
                {
                    ProductID = reader.GetInt32(0),
                    ProductName = reader.GetString(1),
                    Brand = reader.GetString(2),
                    Price = reader.GetDecimal(3)
                };
            }
        }

        return View(product);
    }

    [HttpPost]
    public ActionResult Edit(Product product)
    {
        using (SqlConnection conn = new SqlConnection(connectionString))
        {
            SqlCommand cmd = new SqlCommand("UPDATE Products SET ProductName = @ProductName, Brand = @Brand, Price = @Price WHERE ProductID = @ProductID", conn);
            cmd.Parameters.AddWithValue("@ProductName", product.ProductName);
            cmd.Parameters.AddWithValue("@Brand", product.Brand);
            cmd.Parameters.AddWithValue("@Price", product.Price);
            cmd.Parameters.AddWithValue("@ProductID", product.ProductID);

            conn.Open();
            cmd.ExecuteNonQuery();
        }

        return RedirectToAction("Index");
    }

    public ActionResult Delete(int id)
    {
        using (SqlConnection conn = new SqlConnection(connectionString))
        {
            SqlCommand cmd = new SqlCommand("DELETE FROM Products WHERE ProductID = @ProductID", conn);
            cmd.Parameters.AddWithValue("@ProductID", id);

            conn.Open();
            cmd.ExecuteNonQuery();
        }

        return RedirectToAction("Index");
    }
}
