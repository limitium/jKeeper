jKeeper 
===

##Get single object
```java
ADVehicle ad = k.one("select * from ADVehicle where Number = 8434211", ADVehicle.class);
```

##Get list of objects
```java
List<Offer> list = k.list("select top 10 * from Offer", Offer.class);
```    
    
##Insert object
```java   
ADVehicle ad = new ADVehicle();
k.insert(ad);
```

##Update object
```java  
ADVehicle savedAd = k.one("select * from ADVehicle where regnumber='keeper'", ADVehicle.class);
savedAd.setADMake("bmw");
k.update(savedAd);
```
    
##Use query specific fields
```java
ADVehicle ad = k.one("select CompanyId,RegNumber as rg_id,RegCode as rg,Number from ADVehicle where Number = 8434211", ADVehicle.class, new HashMap<String, String>() {{
  put("RegNumber", "rg_id");
  put("RegCode", "rg");
}});
``` 
    
##Custom data processing
```java
final StringBuffer data = new StringBuffer("");
new Command(k, "SELECT TOP 1000 * FROM VISLog  where OperationId='keeper'") {
  @Override //Call for each row in ResultSet
  public void work(ResultSet rs) throws SQLException {
      data.append(rs.getString("OperationId"));
  }
}      
      .execute();

System.out.println(data); //>>>keeperkeeperkeeperkeeper
```      
