/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiunefirma;

/**
 *
 * @author User
 */
public class Produs {
    private int id;
    private double BasePrice;
    private double SalePrice;
    private double tax;
    private double adaos;
    private String ProductName;
    private String ProductType;
    private String ProductCategory;
    private String ProductSubcategory;
    private String Manufacturer;
    private String Country;
    private String Distributor;
    private double procent;
    public Produs(int id, double BasePrice, double SalePrice, double tax, double adaos, String ProductName, String ProductType, String ProductCategory, String Manufacturer, String Country, String Distributor) {
        this.id = id;
        this.tax = tax;
        this.adaos = adaos;
        this.BasePrice = BasePrice;
         procent=(tax+adaos)*BasePrice;
        this.SalePrice = BasePrice+procent;
        this.ProductName = ProductName;
        this.ProductType = ProductType;
        this.ProductCategory = ProductCategory;
        this.Manufacturer = Manufacturer;
        this.Country = Country;
        this.Distributor = Distributor;
    
    }

   

  
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the BasePrice
     */
    public double getBasePrice() {
        return BasePrice;
    }

    /**
     * @param BasePrice the BasePrice to set
     */
    public void setBasePrice(double BasePrice) {
        this.BasePrice = BasePrice;
    }

    /**
     * @return the SalePrice
     */
    public double getSalePrice() {
        return SalePrice;
    }

    /**
     * @param SalePrice the SalePrice to set
     */
    

    /**
     * @return the tax
     */
    public double getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(double tax) {
        this.tax = tax;
    }

    /**
     * @return the adaos
     */
    public double getAdaos() {
        return adaos;
    }

    /**
     * @param adaos the adaos to set
     */
    public void setAdaos(double adaos) {
        this.adaos = adaos;
    }

    /**
     * @return the ProductName
     */
    public String getProductName() {
        return ProductName;
    }

    /**
     * @param ProductName the ProductName to set
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * @return the ProductType
     */
    public String getProductType() {
        return ProductType;
    }

    /**
     * @param ProductType the ProductType to set
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * @return the ProductCategory
     */
    public String getProductCategory() {
        return ProductCategory;
    }

    /**
     * @param ProductCategory the ProductCategory to set
     */
    public void setProductCategory(String ProductCategory) {
        this.ProductCategory = ProductCategory;
    }

    /**
     * @return the ProductSubcategory
     */
    public String getProductSubcategory() {
        return ProductSubcategory;
    }

    /**
     * @param ProductSubcategory the ProductSubcategory to set
     */
    public void setProductSubcategory(String ProductSubcategory) {
        this.ProductSubcategory = ProductSubcategory;
    }

    /**
     * @return the Manufacturer
     */
    public String getManufacturer() {
        return Manufacturer;
    }

    /**
     * @param Manufacturer the Manufacturer to set
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * @return the Country
     */
    public String getCountry() {
        return Country;
    }

    /**
     * @param Country the Country to set
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * @return the Distributor
     */
    public String getDistributor() {
        return Distributor;
    }

    /**
     * @param Distributor the Distributor to set
     */
    public void setDistributor(String Distributor) {
        this.Distributor = Distributor;
    }
}
