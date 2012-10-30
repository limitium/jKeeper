package jKeeperTest.model;

import jKeeper.annotation.*;
import org.slf4j.LoggerFactory;

import java.util.Vector;

@Table("ADVehicle")
public class ADVehicle implements Cloneable {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ADVehicle.class);
    @Skip
    private String akeErrorText;
    @Skip
    private String akeWarningText;
    @Skip
    private Vector atjLimitations;
    @Skip
    private Vector atjSafetyEquipment;
    @Skip
    private Vector atjTyres;
    private String CompanyId;
    private String RegNumber;
    private String RegCode;
    @Skip
    private String typeApprovalCode;
    @Skip
    private String variant;
    @Skip
    private String version;
    @Skip
    private String commercialName;
    private String RegDate;
    private String ChassisNbr;
    private String Fuel;
    private String Colour;
    private String MediaColour;
    private String Power;
    private String CylVolume;
    private String NetWeight;
    private String GrossWeight;
    private String InsuranceComp;
    private String MOTDate;
    private String UsageId;
    private String OwnerName;
    private String OwnerAddress;
    private String OwnerPostCode;
    private String OwnerCity;
    // Owner 2
    private String Owner2Name;
    private String Owner2Address;
    private String Owner2PostCode;
    private String Owner2City;
    //
    private String UserName;
    private String UserAddress;
    private String UserPostCode;
    private String UserCity;
    //
    private String User2Name;
    private String User2Address;
    private String User2PostCode;
    private String User2City;
    // Owner/User limitations (ATJ)
    @Skip
    private String ownerLimitation;
    @Skip
    private String owner2Limitation;
    @Skip
    private String userLimitation;
    @Skip
    private String user2Limitation;

    private String AxleDistance;
    private String AxleType;
    private String AxleWeight;
    private String BodyTypeCode;
    private String BrakeCode;
    private String Brake2;
    private String Carburator;
    private String CarTaxNotPaid;
    private String CarUser2;
    private String ChassisType;
    private String City;
    private String CityCode;
    private String CoPilots;
    private String Country;
    @Skip
    private String importCountryCode;
    @Skip
    private String importCountryName;
    private String CurbWeight;
    private String DieselTaxNotPaidCode;
    private String EmissionCode;
    private String ExtraColour;
    private String InsCompany;
    private String InsCompanyCode;
    private String InTrafficDate;
    private String IsRegistered;
    private String Length;
    private String LowEmission;
    private String Luggage;
    private String AKEMake;
    private String ManGrossWeight;
    private String MaxWeight;
    private String AKEModel;
    private String Mortgage;
    private String MOTYear;
    private String OptionsWithCode;
    private String Owner2;
    private String Passengers;
    private String RoofWeight;
    private String SafetyEquipment;
    private String TankCapacity;
    private String TowWeightWithBrakes;
    private String Turbo;
    private String Tyres;
    private String Usage;
    private String VehicleType;
    private String Width;
    private String ADMake;
    private String ADModel;
    private String ADType;
    private String TyId;
    private String PriceDate;
    private String FirstYear;
    private String LastYear;
    private String Speed;
    private String Accel;
    private String ADPower;
    private String CylDisplacement;
    private String FuelCons1;
    private String FuelCons2;
    private String FuelCons4;
    private String Doors;
    private String AskPrice;
    private String SalePrice;
    private String PurchasePrice;
    private String NewPrice;
    private String QueryDate;
    private String CO2;
    @Skip
    private float EmissionTax;
    @Id
    @Column("Number")
    private String Id;
    private String ADTypeList;
    private String modelYear;
    private String GroupId;
    @Skip
    private String timeStamp;
    @Skip
    private String akeDateLastUpdated;
    @Skip
    private String parallelImport;

    public String getToSkipField() {
        return toSkipField;
    }

    public void setToSkipField(String toSkipField) {
        this.toSkipField = toSkipField;
    }

    @Skip
    private String toSkipField;

    public ADVehicle clone() throws CloneNotSupportedException {
        try {
            return (ADVehicle) super.clone();
        } catch (CloneNotSupportedException e) {
            logger.warn("Failed clone ADVehicle", e);
            return null;
        }
    }
    /**
     * Constructor.
     */
    public ADVehicle() {
        CompanyId = null;
        RegCode = null;
        RegDate = null;
        ChassisNbr = null;
        Fuel = null;
        Colour = null;
        MediaColour = null;
        Power = null;
        CylVolume = null;
        NetWeight = null;
        GrossWeight = null;
        InsuranceComp = null;
        MOTDate = null;
        UsageId = null;
        OwnerName = null;
        OwnerAddress = null;
        OwnerPostCode = null;
        OwnerCity = null;
        Owner2Name = null;
        Owner2Address = null;
        Owner2PostCode = null;
        Owner2City = null;
        UserName = null;
        UserAddress = null;
        UserPostCode = null;
        UserCity = null;
        User2Name = null;
        User2Address = null;
        User2PostCode = null;
        User2City = null;
        AxleDistance = null;
        AxleType = null;
        AxleWeight = null;
        BodyTypeCode = null;
        BrakeCode = null;
        Brake2 = null;
        Carburator = null;
        CarTaxNotPaid = null;
        CarUser2 = null;
        ChassisType = null;
        City = null;
        CityCode = null;
        CoPilots = null;
        Country = null;
        importCountryCode = null;
        importCountryName = null;
        CurbWeight = null;
        DieselTaxNotPaidCode = null;
        EmissionCode = null;
        ExtraColour = null;
        InsCompany = null;
        InsCompanyCode = null;
        InTrafficDate = null;
        IsRegistered = null;
        Length = null;
        LowEmission = null;
        Luggage = null;
        AKEMake = null;
        ManGrossWeight = null;
        MaxWeight = null;
        AKEModel = null;
        Mortgage = null;
        MOTYear = null;
        OptionsWithCode = null;
        Owner2 = null;
        Passengers = null;
        RoofWeight = null;
        SafetyEquipment = null;
        TankCapacity = null;
        TowWeightWithBrakes = null;
        Turbo = null;
        Tyres = null;
        Usage = null;
        VehicleType = null;
        Width = null;
        ADMake = null;
        ADModel = null;
        ADType = null;
        TyId = null;
        PriceDate = null;
        FirstYear = null;
        LastYear = null;
        Speed = null;
        Accel = null;
        ADPower = null;
        CylDisplacement = null;
        FuelCons1 = null;
        FuelCons2 = null;
        FuelCons4 = null;
        Doors = null;
        AskPrice = null;
        SalePrice = null;
        PurchasePrice = null;
        NewPrice = null;
        QueryDate = null;
        GroupId = null;
        modelYear = null;

    }


    public ADVehicle(String empty) {

        CompanyId = empty;

        RegCode = empty;

        RegDate = empty;

        ChassisNbr = empty;

        Fuel = empty;

        Colour = empty;

        MediaColour = empty;

        Power = empty;

        CylVolume = "0";

        NetWeight = empty;

        GrossWeight = empty;

        InsuranceComp = empty;

        MOTDate = empty;

        UsageId = empty;

        OwnerName = empty;

        OwnerAddress = empty;

        OwnerPostCode = empty;

        OwnerCity = empty;

        UserName = empty;

        UserAddress = empty;

        UserPostCode = empty;

        UserCity = empty;

        Owner2Name = empty;

        Owner2Address = empty;

        Owner2PostCode = empty;

        Owner2City = empty;

        User2Name = empty;

        User2Address = empty;

        User2PostCode = empty;

        User2City = empty;

        AxleDistance = empty;

        AxleType = empty;

        AxleWeight = empty;

        BodyTypeCode = empty;

        BrakeCode = empty;

        Brake2 = empty;

        Carburator = empty;

        CarTaxNotPaid = empty;

        CarUser2 = empty;

        ChassisType = empty;

        City = empty;

        CityCode = empty;

        CoPilots = empty;

        Country = empty;

        importCountryCode = empty;
        importCountryName = empty;

        CurbWeight = empty;

        DieselTaxNotPaidCode = empty;

        EmissionCode = empty;

        ExtraColour = empty;

        InsCompany = empty;

        InsCompanyCode = empty;

        InTrafficDate = empty;

        IsRegistered = empty;

        Length = empty;

        LowEmission = empty;

        Luggage = empty;

        AKEMake = empty;

        ManGrossWeight = empty;

        MaxWeight = empty;

        AKEModel = empty;

        Mortgage = empty;

        MOTYear = empty;

        OptionsWithCode = empty;

        Owner2 = empty;

        Passengers = empty;

        RoofWeight = empty;

        SafetyEquipment = empty;

        TankCapacity = empty;

        TowWeightWithBrakes = empty;

        Turbo = empty;

        Tyres = empty;

        Usage = empty;

        VehicleType = empty;

        Width = empty;

        ADMake = empty;

        ADModel = empty;

        ADType = empty;

        TyId = empty;

        PriceDate = empty;

        FirstYear = empty;

        LastYear = empty;

        Speed = empty;

        Accel = empty;

        ADPower = empty;

        CylDisplacement = empty;

        FuelCons1 = empty;

        FuelCons2 = empty;

        FuelCons4 = empty;

        Doors = empty;

        AskPrice = empty;

        SalePrice = empty;

        PurchasePrice = empty;

        NewPrice = empty;

        QueryDate = empty;

        CO2 = empty;

        EmissionTax = 0;

        ADTypeList = empty;

        modelYear = empty;

        GroupId = empty;

    }



    /**
     * Returns vehicle class (passenger car, van, bus, lorry, truck ...)
     * <p/>
     * in a format better suited for AD's (Grey-Hen's) purposes.
     * <p/>
     * Note: AKE returns values such as HENKILÃAUT, KUORMA-AUTO in this field.
     * <p/>
     * Here we convert them to values used by the Finnish DMSs.
     * <p/>
     * <p/>
     * <p/>
     * Note: Tyyppihaulla haetut autot palauttavat tyhjÃ¤n.
     */

    public int getADVehicleClassId(String name) {


        int temp = 0;


        if (name == null) {

            temp = 0;


        } else if (name.equals("")) {

        } else if (name.equals("Henkilöauto")) {

            temp = 5;


        } else if (name.equals("Bussi")) {

            temp = 1;


        } else if (name.equals("Kuorma-auto")) {

            temp = 2;

        } else if (name.equals("Maastoajoneuvo")) {

            temp = 8;

        } else if (name.equals("Matkailuauto")) {

            temp = 6;

        } else if (name.equals("Moottorikelkka")) {

            temp = 7;

        } else if (name.equals("Moottorpyörä")) {

            temp = 9;

        } else if (name.equals("Pakettiauto")) {

            temp = 4;

        }


        return temp;

    }


    /**
     * Returns transmissionid (passenger A5, M5, CVT ...)
     * <p/>
     * in a format better suited for AD's (Grey-Hen's) purposes.
     * <p/>
     * Added 24.3.2010 - ST
     */

    public String getADTransmissionId(String name) {


        String temp = "";


        if (name == null) {

            temp = "";

        } else if (name.equals("")) {

            // A = Automaattinen

        } else if (name.equals("A")) {

            temp = "A";

        } else if (name.equals("AP")) {

            temp = "A";

        } else if (name.equals("A3+0")) {

            temp = "A";

        } else if (name.equals("Ax2")) {

            temp = "A";

        } else if (name.equals("A2xm")) {

            temp = "A";

        } else if (name.equals("A7")) {

            temp = "A";

        } else if (name.equals("A3")) {

            temp = "A";

        } else if (name.equals("ATT")) {

            temp = "A";

            //M = Manuaalinen

        } else if (name.equals("5")) {

            temp = "M";

            // 9 = Automaattinen 6 portainen

        } else if (name.equals("A6")) {

            temp = "9";

            // 7 = Automaattinen 4 portainen

        } else if (name.equals("A4")) {

            temp = "7";

        } else if (name.equals("AV4")) {

            temp = "7";

        } else if (name.equals("A4+0")) {

            temp = "7";

            // L = Automaattinen Portaaton (Multitronic)

        } else if (name.equals("L2")) {

            temp = "L";

        } else if (name.equals("L4")) {

            temp = "L";

        } else if (name.equals("L6")) {

            temp = "L";

        } else if (name.equals("L7")) {

            temp = "L";

        } else if (name.equals("L1")) {

            temp = "L";

        } else if (name.equals("L3")) {

            temp = "L";

        } else if (name.equals("L5")) {

            temp = "L";

            // 8 = Automaattinen 5 portainen

        } else if (name.equals("A5")) {

            temp = "8";

            // 6 = Manuaalinen kuusiportainen

        } else if (name.equals("M6")) {

            temp = "6";

        } else if (name.equals("6")) {

            temp = "6";

        } else if (name.equals("6+1")) {

            temp = "6";

            // 4 = Manuaalinen neliportainen

        } else if (name.equals("4")) {

            temp = "4";

            // 5 = Manuaalinen 5 portainen

        } else if (name.equals("AV5")) {

            temp = "5";

        } else if (name.equals("A5")) {

            temp = "5";

        } else if (name.equals("M5")) {

            temp = "5";

        } else if (name.equals("M")) {

            temp = "5";

        } else if (name.equals("5+1")) {

            temp = "5";

        } else if (name.equals("5x2")) {

            temp = "5";

        } else if (name.equals("V5")) {

            temp = "5";

            // C = Puoliautomaatti (CVT)

        } else if (name.equals("CVT")) {
            temp = "C";
        } else if (name.equals("ACVT")) {
            temp = "C";
        }

        return temp;

    }





    /**

     *	Returns the registration year  (read-only)

     */

    /* public String getRegYear() {

    return this.RegDate.substring(0,4);

    }*/

    /**
     * Returns the registration year, fallback to RegDate if data not good  (read-only)
     */

    public String getRegYear() {


        // Test RegDate.

        String temp = this.RegDate;


        if (temp == null) {

            temp = "";

        }

        if (temp.length() == 8 && !temp.equals("        ")) {

            // RegDate good, return.

            return temp.substring(0, 4);

        } else {

            // RegDate not good, return "0".

            return "0";

        }

    }


    /**
     * Returns the registration month  (read-only)
     */

    public String getRegMonth() {

        return this.RegDate.substring(4, 6);

    }


    /**
     * Returns the model year
     */

    public String getModelYear() {

        return this.modelYear;

    }


    /**
     * Assigns the model year
     */

    public void setModelYear(String par) {

        this.modelYear = par;

    }


    /**
     * Returns the inTrafficDate year, fallback to RegDate if data not good  (read-only)
     */

    public String getInTrafficYearFbRegYear() {


        // Test InTrafficDate.

        String temp = this.InTrafficDate;


        if (temp == null) {

            temp = "";

        }

        if (temp.length() == 8 && !temp.equals("        ")) {

            // InTrafficDate good, return.

            return temp.substring(0, 4);

        } else {

            // InTrafficDate not good, test RegDate.

            temp = this.RegDate;


            if (temp == null) {

                temp = "";

            }

            if (temp.length() == 8 && !temp.equals("        ")) {

                // RegDate good, return.

                return temp.substring(0, 4);

            } else {

                // RegDate not good either, return "0".

                return "0";

            }

        }

    }


    /**
     * Returns the inTrafficDate month, fallback to RegDate if data not good (read-only)
     */

    public String getInTrafficMonthFbRegMonth() {


        // Test InTrafficDate.

        String temp = this.InTrafficDate;


        if (temp == null) {

            temp = "";

        }

        if (temp.length() == 8 && !temp.equals("        ")) {

            // InTrafficDate good, return.

            return temp.substring(4, 6);

        } else {

            // InTrafficDate not good, test RegDate.

            temp = this.RegDate;


            if (temp == null) {

                temp = "";

            }

            if (temp.length() == 8 && !temp.equals("        ")) {

                // RegDate good, return.

                return temp.substring(4, 6);

            } else {

                // RegDate not good either, return "0".

                return "0";

            }

        }

    }






    /**
     * EmissionTax
     * <p/>
     * Will be calculated in sql procedure or with simple calculation form
     */

    public float getEmissionTaxCount() {
        return 0;
    }


    /**
     * Assign a CompanyId this ADVehicle.
     */

    public void setCompanyId(String par) {

        this.CompanyId = par;

    }


    /**
     * Assign a RegNumber for this ADVehicle.
     */

    public void setRegNumber(String par) {

        this.RegNumber = par;

    }


    /**
     * Returns the RegNumber of the ADVehicle.
     */

    public String getRegNumber() {

        return this.RegNumber;

    }


    /**
     * Assign a RegCode for this ADVehicle.
     */

    public void setRegCode(String par) {

        this.RegCode = par;

    }


    /**
     * Returns the RegCode of the ADVehicle.
     */

    public String getRegCode() {

        return this.RegCode;

    }


    /**
     * Assign a TypeApprovalCode for this ADVehicle.
     */

    public void setTypeApprovalCode(String par) {

        this.typeApprovalCode = par;

    }


    /**
     * Returns the TypeApprovalCode of the ADVehicle.
     */

    public String getTypeApprovalCode() {

        return this.typeApprovalCode;

    }


    /**
     * Assign a Variant for this ADVehicle.
     */

    public void setVariant(String par) {

        this.variant = par;

    }


    /**
     * Returns the Variant of the ADVehicle.
     */

    public String getVariant() {

        return this.variant;

    }


    /**
     * Assign a Version for this ADVehicle.
     */

    public void setVersion(String par) {

        this.version = par;

    }


    /**
     * Returns the Version of the ADVehicle.
     */

    public String getVersion() {

        return this.version;

    }


    /**
     * Assign a CommercialName for this ADVehicle.
     */

    public void setCommercialName(String par) {

        this.commercialName = par;

    }


    /**
     * Returns the CommercialName of the ADVehicle.
     */

    public String getCommercialName() {

        return this.commercialName;

    }


    /**
     * Assign a RegDate for this ADVehicle.
     */

    public void setRegDate(String par) {

        this.RegDate = par;

    }


    /**
     * Returns the RegDate of the ADVehicle.
     */

    public String getRegDate() {

        return this.RegDate;

    }


    /**
     * Assign a ChassisNbr for this ADVehicle.
     */

    public void setChassisNbr(String par) {

        this.ChassisNbr = par;

    }


    /**
     * Returns the ChassisNbr of the ADVehicle.
     */

    public String getChassisNbr() {

        return this.ChassisNbr;

    }


    /**
     * Assign a Fuel for this ADVehicle.
     */

    public void setFuel(String par) {

        this.Fuel = par;

    }


    /**
     * Returns the Fuel of the ADVehicle.
     */

    public String getFuel() {

        return this.Fuel;

    }


    /**
     * Assign a Colour for this ADVehicle.
     */

    public void setColour(String par) {

        this.Colour = par;

    }


    /**
     * Returns the Colour of the ADVehicle.
     */

    public String getColour() {

        return this.Colour;

    }


    /**
     * Assign a MediaColour for this ADVehicle.
     */

    public void setMediaColour(String par) {

        this.MediaColour = par;

    }


    /**
     * Returns the MediaColour of the ADVehicle.
     */

    public String getMediaColour() {

        return this.MediaColour;

    }


    /**
     * Assign a Power for this ADVehicle.
     */

    public void setPower(String par) {

        this.Power = par;

    }


    /**
     * Returns the Power of the ADVehicle.
     */

    public String getPower() {

        return this.Power;

    }


    /**
     * Assign a CylVolume for this ADVehicle.
     */

    public void setCylVolume(String par) {

        this.CylVolume = par;

    }


    /**
     * Returns the CylVolume of the ADVehicle.
     */

    public String getCylVolume() {

        return this.CylVolume;

    }


    /**
     * Assign a NetWeight for this ADVehicle.
     */

    public void setNetWeight(String par) {

        this.NetWeight = par;

    }


    /**
     * Returns the NetWeight of the ADVehicle.
     */

    public String getNetWeight() {

        return this.NetWeight;

    }


    /**
     * Assign a GrossWeight for this ADVehicle.
     */

    public void setGrossWeight(String par) {

        this.GrossWeight = par;

    }


    /**
     * Returns the GrossWeight of the ADVehicle.
     */

    public String getGrossWeight() {

        return this.GrossWeight;

    }


    /**
     * Assign a InsuranceComp for this ADVehicle.
     */

    public void setInsuranceComp(String par) {

        this.InsuranceComp = par;

    }


    /**
     * Returns the InsuranceComp of the ADVehicle.
     */

    public String getInsuranceComp() {

        return this.InsuranceComp;

    }


    /**
     * Assign a MOTDate for this ADVehicle.
     */

    public void setMOTDate(String par) {

        this.MOTDate = par;

    }


    /**
     * Returns the MOTDate of the ADVehicle.
     */

    public String getMOTDate() {

        return this.MOTDate;

    }


    /**
     * Assign a UsageId for this ADVehicle.
     */

    public void setUsageId(String par) {

        this.UsageId = par;

    }


    /**
     * Returns the CompanyId of the ADVehicle.
     */

    public String getCompanyId() {

        return this.CompanyId;

    }


    /**
     * Returns the UsageId of the ADVehicle.
     */

    public String getUsageId() {

        return this.UsageId;

    }


    /**
     * Assign a OwnerName for this ADVehicle.
     */

    public void setOwnerName(String par) {

        this.OwnerName = par;

    }


    /**
     * Returns the OwnerName of the ADVehicle.
     */

    public String getOwnerName() {

        return this.OwnerName;

    }


    /**
     * Assign a OwnerAddress for this ADVehicle.
     */

    public void setOwnerAddress(String par) {

        this.OwnerAddress = par;

    }


    /**
     * Returns the OwnerAddress of the ADVehicle.
     */

    public String getOwnerAddress() {

        return this.OwnerAddress;

    }


    /**
     * Assign a OwnerPostCode for this ADVehicle.
     */

    public void setOwnerPostCode(String par) {

        this.OwnerPostCode = par;

    }


    /**
     * Returns the OwnerPostCode of the ADVehicle.
     */

    public String getOwnerPostCode() {

        return this.OwnerPostCode;

    }


    /**
     * Assign a OwnerCity for this ADVehicle.
     */

    public void setOwnerCity(String par) {

        this.OwnerCity = par;

    }


    /**
     * Returns the OwnerCity of the ADVehicle.
     */

    public String getOwnerCity() {

        return this.OwnerCity;

    }


    /**
     * Assign a UserName for this ADVehicle.
     */

    public void setUserName(String par) {

        this.UserName = par;

    }


    /**
     * Returns the UserName of the ADVehicle.
     */

    public String getUserName() {

        return this.UserName;

    }


    /**
     * Assign a UserAddress for this ADVehicle.
     */

    public void setUserAddress(String par) {

        this.UserAddress = par;

    }


    /**
     * Returns the UserAddress of the ADVehicle.
     */

    public String getUserAddress() {

        return this.UserAddress;

    }


    /**
     * Assign a UserPostCode for this ADVehicle.
     */

    public void setUserPostCode(String par) {

        this.UserPostCode = par;

    }


    /**
     * Returns the UserPostCode of the ADVehicle.
     */

    public String getUserPostCode() {

        return this.UserPostCode;

    }


    /**
     * Assign a UserCity for this ADVehicle.
     */

    public void setUserCity(String par) {

        this.UserCity = par;

    }


    /**
     * Returns the UserCity of the ADVehicle.
     */

    public String getUserCity() {

        return this.UserCity;

    }


    /**
     * Assign a Owner2Name for this ADVehicle.
     */

    public void setOwner2Name(String par) {

        this.Owner2Name = par;

    }


    /**
     * Returns the Owner2Name of the ADVehicle.
     */

    public String getOwner2Name() {

        return this.Owner2Name;

    }


    /**
     * Assign a Owner2Address for this ADVehicle.
     */

    public void setOwner2Address(String par) {

        this.Owner2Address = par;

    }


    /**
     * Returns the Owner2Address of the ADVehicle.
     */

    public String getOwner2Address() {

        return this.Owner2Address;

    }


    /**
     * Assign a Owner2PostCode for this ADVehicle.
     */

    public void setOwner2PostCode(String par) {

        this.Owner2PostCode = par;

    }


    /**
     * Returns the Owner2PostCode of the ADVehicle.
     */

    public String getOwner2PostCode() {

        return this.Owner2PostCode;

    }


    /**
     * Assign a Owner2City for this ADVehicle.
     */

    public void setOwner2City(String par) {

        this.Owner2City = par;

    }


    /**
     * Returns the Owner2City of the ADVehicle.
     */

    public String getOwner2City() {

        return this.Owner2City;

    }


    /**
     * Assign a User2Name for this ADVehicle.
     */

    public void setUser2Name(String par) {

        this.User2Name = par;

    }


    /**
     * Returns the User2Name of the ADVehicle.
     */

    public String getUser2Name() {

        return this.User2Name;

    }


    /**
     * Assign a User2Address for this ADVehicle.
     */

    public void setUser2Address(String par) {

        this.User2Address = par;

    }


    /**
     * Returns the User2Address of the ADVehicle.
     */

    public String getUser2Address() {

        return this.User2Address;

    }


    /**
     * Assign a User2PostCode for this ADVehicle.
     */

    public void setUser2PostCode(String par) {

        this.User2PostCode = par;

    }


    /**
     * Returns the User2PostCode of the ADVehicle.
     */

    public String getUser2PostCode() {

        return this.User2PostCode;

    }


    /**
     * Assign a User2City for this ADVehicle.
     */

    public void setUser2City(String par) {

        this.User2City = par;

    }


    /**
     * Returns the User2City of the ADVehicle.
     */

    public String getUser2City() {

        return this.User2City;

    }


    /**
     * Assign a ownerLimitation for this ADVehicle.
     */

    public void setOwnerLimitation(String par) {

        this.ownerLimitation = par;

    }


    /**
     * Returns the ownerLimitation of the ADVehicle.
     */

    public String getOwnerLimitation() {

        return this.ownerLimitation;

    }


    /**
     * Assign a owner2Limitation for this ADVehicle.
     */

    public void setOwner2Limitation(String par) {

        this.owner2Limitation = par;

    }


    /**
     * Returns the owner2Limitation of the ADVehicle.
     */

    public String getOwner2Limitation() {

        return this.owner2Limitation;

    }


    /**
     * Assign a userLimitation for this ADVehicle.
     */

    public void setUserLimitation(String par) {

        this.userLimitation = par;

    }


    /**
     * Returns the userLimitation of the ADVehicle.
     */

    public String getUserLimitation() {

        return this.userLimitation;

    }


    /**
     * Assign a user2Limitation for this ADVehicle.
     */

    public void setUser2Limitation(String par) {

        this.user2Limitation = par;

    }


    /**
     * Returns the user2Limitation of the ADVehicle.
     */

    public String getUser2Limitation() {

        return this.user2Limitation;

    }


    /**
     * Assign a AxleDistance for this ADVehicle.
     */

    public void setAxleDistance(String par) {

        this.AxleDistance = par;

    }


    /**
     * Returns the AxleDistance of the ADVehicle.
     */

    public String getAxleDistance() {

        return this.AxleDistance;

    }


    /**
     * Assign a AxleType for this ADVehicle.
     */

    public void setAxleType(String par) {

        this.AxleType = par;

    }


    /**
     * Returns the AxleType of the ADVehicle.
     */

    public String getAxleType() {

        return this.AxleType;

    }


    /**
     * Assign a AxleWeight for this ADVehicle.
     */

    public void setAxleWeight(String par) {

        this.AxleWeight = par;

    }


    /**
     * Returns the AxleWeight of the ADVehicle.
     */

    public String getAxleWeight() {

        return this.AxleWeight;

    }


    /**
     * Assign a BodyTypeCode for this ADVehicle.
     */

    public void setBodyTypeCode(String par) {

        this.BodyTypeCode = par;

    }


    /**
     * Returns the BodyTypeCode of the ADVehicle.
     */

    public String getBodyTypeCode() {

        return this.BodyTypeCode;

    }


    /**
     * Assign a BrakeCode for this ADVehicle.
     */

    public void setBrakeCode(String par) {

        this.BrakeCode = par;

    }


    /**
     * Returns the BrakeCode of the ADVehicle.
     */

    public String getBrakeCode() {

        return this.BrakeCode;

    }


    /**
     * Assign a Brake2 for this ADVehicle.
     */

    public void setBrake2(String par) {

        this.Brake2 = par;

    }


    /**
     * Returns the Brake2 of the ADVehicle.
     */

    public String getBrake2() {

        return this.Brake2;

    }


    /**
     * Assign a Carburator for this ADVehicle.
     */

    public void setCarburator(String par) {

        this.Carburator = par;

    }


    /**
     * Returns the Carburator of the ADVehicle.
     */

    public String getCarburator() {

        return this.Carburator;

    }



    /**
     * Returns the CarTaxNotPaid of the ADVehicle.
     */

    public String getCarTaxNotPaid() {

        return this.CarTaxNotPaid;

    }


    /**
     * Assign a CarUser2 for this ADVehicle.
     */

    public void setCarUser2(String par) {

        this.CarUser2 = par;

    }


    /**
     * Returns the CarUser2 of the ADVehicle.
     */

    public String getCarUser2() {

        return this.CarUser2;

    }


    /**
     * Assign a ChassisType for this ADVehicle.
     */

    public void setChassisType(String par) {

        this.ChassisType = par;

    }


    /**
     * Returns the ChassisType of the ADVehicle.
     */

    public String getChassisType() {

        return this.ChassisType;

    }


    /**
     * Assign a City for this ADVehicle.
     */

    public void setCity(String par) {

        this.City = par;

    }


    /**
     * Returns the City of the ADVehicle.
     */

    public String getCity() {

        return this.City;

    }


    /**
     * Assign a CityCode for this ADVehicle.
     */

    public void setCityCode(String par) {

        this.CityCode = par;

    }


    /**
     * Returns the CityCode of the ADVehicle.
     */

    public String getCityCode() {

        return this.CityCode;

    }


    /**
     * Assign a CoPilots for this ADVehicle.
     */

    public void setCoPilots(String par) {

        this.CoPilots = par;

    }


    /**
     * Returns the CoPilots of the ADVehicle.
     */

    public String getCoPilots() {

        return this.CoPilots;

    }


    /**
     * Assign a Country for this ADVehicle.
     */

    public void setCountry(String par) {

        this.Country = par;

    }


    /**
     * Returns the Country of the ADVehicle.
     */

    public String getCountry() {

        return this.Country;

    }


    public String getImportCountryCode() {
        return this.importCountryCode;
    }

    public void setImportCountryCode(String par) {
        this.importCountryCode = par;
    }

    public String getImportCountryName() {
        return this.importCountryName;
    }

    public void setImportCountryName(String par) {
        this.importCountryName = par;
    }

    /**
     * Assign a CurbWeight for this ADVehicle.
     */

    public void setCurbWeight(String par) {

        this.CurbWeight = par;

    }


    /**
     * Returns the CurbWeight of the ADVehicle.
     */

    public String getCurbWeight() {

        return this.CurbWeight;

    }


    /**
     * Assign a DieselTaxNotPaidCode for this ADVehicle.
     */




    /**
     * Returns the DieselTaxNotPaidCode of the ADVehicle.
     */

    public String getDieselTaxNotPaidCode() {

        return this.DieselTaxNotPaidCode;

    }

    public void setCarTaxNotPaid(String carTaxNotPaid) {
        CarTaxNotPaid = carTaxNotPaid;
    }

    public void setDieselTaxNotPaidCode(String dieselTaxNotPaidCode) {
        DieselTaxNotPaidCode = dieselTaxNotPaidCode;
    }

    /**
     * Assign a EmissionCode for this ADVehicle.
     */

    public void setEmissionCode(String par) {

        /* XXX - this is a quick hack   / Sampsa

         */

        try {

            this.EmissionCode = Integer.valueOf(par).toString();

        } catch (NumberFormatException nfe) {

            logger.error(nfe.getMessage(), nfe);
            par = "0";

        }

    }


    /**
     * Returns the EmissionCode of the ADVehicle.
     */

    public String getEmissionCode() {

        return this.EmissionCode;

    }


    /**
     * Assign a ExtraColour for this ADVehicle.
     */

    public void setExtraColour(String par) {

        this.ExtraColour = par;

    }


    /**
     * Returns the ExtraColour of the ADVehicle.
     */

    public String getExtraColour() {

        return this.ExtraColour;

    }


    /**
     * Assign a InsCompany for this ADVehicle.
     */

    public void setInsCompany(String par) {

        this.InsCompany = par;

    }


    /**
     * Returns the InsCompany of the ADVehicle.
     */

    public String getInsCompany() {

        return this.InsCompany;

    }


    /**
     * Assign a InsCompanyCode for this ADVehicle.
     */

    public void setInsCompanyCode(String par) {

        this.InsCompanyCode = par;

    }


    /**
     * Returns the InsCompanyCode of the ADVehicle.
     */

    public String getInsCompanyCode() {

        return this.InsCompanyCode;

    }


    /**
     * Assign a InTrafficDate for this ADVehicle.
     */

    public void setInTrafficDate(String par) {

        this.InTrafficDate = par;

    }


    /**
     * Returns the InTrafficDate of the ADVehicle.
     */

    public String getInTrafficDate() {

        return this.InTrafficDate;

    }


    /**
     * Assign a IsRegistered for this ADVehicle.
     */

    public void setIsRegistered(String par) {

        this.IsRegistered = par;

    }


    /**
     * Returns the IsRegistered of the ADVehicle.
     */

    public String getIsRegistered() {

        return this.IsRegistered;

    }


    /**
     * Assign a Length for this ADVehicle.
     */

    public void setLength(String par) {

        this.Length = par;

    }


    /**
     * Returns the Length of the ADVehicle.
     */

    public String getLength() {

        return this.Length;

    }


    /**
     * Assign a LowEmission for this ADVehicle.
     */

    public void setLowEmission(String par) {

        this.LowEmission = par;

    }


    /**
     * Returns the LowEmission of the ADVehicle.
     */

    public String getLowEmission() {

        return this.LowEmission;

    }


    /**
     * Assign a Luggage for this ADVehicle.
     */

    public void setLuggage(String par) {

        this.Luggage = par;

    }


    /**
     * Returns the Luggage of the ADVehicle.
     */

    public String getLuggage() {

        return this.Luggage;

    }


    /**
     * Assign a AKEMake for this ADVehicle.
     */

    public void setAKEMake(String par) {

        this.AKEMake = par;

    }


    /**
     * Returns the AKEMake of the ADVehicle.
     */

    public String getAKEMake() {

        return this.AKEMake;

    }


    /**
     * Assign a ManGrossWeight for this ADVehicle.
     */

    public void setManGrossWeight(String par) {

        this.ManGrossWeight = par;

    }


    /**
     * Returns the ManGrossWeight of the ADVehicle.
     */

    public String getManGrossWeight() {

        return this.ManGrossWeight;

    }


    /**
     * Assign a MaxWeight for this ADVehicle.
     */

    public void setMaxWeight(String par) {

        this.MaxWeight = par;

    }


    /**
     * Returns the MaxWeight of the ADVehicle.
     */

    public String getMaxWeight() {

        return this.MaxWeight;

    }


    /**
     * Assign a AKEModel for this ADVehicle.
     */

    public void setAKEModel(String par) {

        this.AKEModel = par;

    }


    /**
     * Returns the AKEModel of the ADVehicle.
     */

    public String getAKEModel() {

        return this.AKEModel;

    }


    /**
     * Assign a Mortgage for this ADVehicle.
     */

    public void setMortgage(String par) {

        this.Mortgage = par;

    }


    /**
     * Returns the Mortgage of the ADVehicle.
     */

    public String getMortgage() {

        return this.Mortgage;

    }


    /**
     * Assign a MOTYear for this ADVehicle.
     */

    public void setMOTYear(String par) {

        this.MOTYear = par;

    }


    /**
     * Returns the MOTYear of the ADVehicle.
     */

    public String getMOTYear() {

        return this.MOTYear;

    }


    /**
     * Assign a OptionsWithCode for this ADVehicle.
     */

    public void setOptionsWithCode(String par) {

        this.OptionsWithCode = par;

    }


    /**
     * Returns the OptionsWithCode of the ADVehicle.
     */

    public String getOptionsWithCode() {

        return this.OptionsWithCode;

    }


    /**
     * Assign a Owner2 for this ADVehicle.
     */

    public void setOwner2(String par) {

        this.Owner2 = par;

    }


    /**
     * Returns the Owner2 of the ADVehicle.
     */

    public String getOwner2() {

        return this.Owner2;

    }


    /**
     * Assign a Passengers for this ADVehicle.
     */

    public void setPassengers(String par) {

        this.Passengers = par;

    }


    /**
     * Returns the Passengers of the ADVehicle.
     */

    public String getPassengers() {

        return this.Passengers;

    }


    /**
     * Assign a RoofWeight for this ADVehicle.
     */

    public void setRoofWeight(String par) {

        this.RoofWeight = par;

    }


    /**
     * Returns the RoofWeight of the ADVehicle.
     */

    public String getRoofWeight() {

        return this.RoofWeight;

    }


    /**
     * Assign a SafetyEquipment for this ADVehicle.
     */

    public void setSafetyEquipment(String par) {

        this.SafetyEquipment = par;

    }


    /**
     * Returns the SafetyEquipment of the ADVehicle.
     */

    public String getSafetyEquipment() {

        return this.SafetyEquipment;

    }


    /**
     * Assign a TankCapacity for this ADVehicle.
     */

    public void setTankCapacity(String par) {

        this.TankCapacity = par;

    }


    /**
     * Returns the TankCapacity of the ADVehicle.
     */

    public String getTankCapacity() {

        return this.TankCapacity;

    }


    /**
     * Assign a TowWeightWithBrakes for this ADVehicle.
     */

    public void setTowWeightWithBrakes(String par) {

        this.TowWeightWithBrakes = par;

    }


    /**
     * Returns the TowWeightWithBrakes of the ADVehicle.
     */

    public String getTowWeightWithBrakes() {

        return this.TowWeightWithBrakes;

    }


    /**
     * Assign a Turbo for this ADVehicle.
     */

    public void setTurbo(String par) {

        this.Turbo = par;

    }


    /**
     * Returns the Turbo of the ADVehicle.
     */

    public String getTurbo() {

        return this.Turbo;

    }


    /**
     * Assign a Tyres for this ADVehicle.
     */

    public void setTyres(String par) {

        this.Tyres = par;

    }


    /**
     * Returns the Tyres of the ADVehicle.
     */

    public String getTyres() {

        return this.Tyres;

    }


    /**
     * Assign a Usage for this ADVehicle.
     */

    public void setUsage(String par) {

        this.Usage = par;

    }


    /**
     * Returns the Usage of the ADVehicle.
     */

    public String getUsage() {

        return this.Usage;

    }


    /**
     * Assign a VehicleType for this ADVehicle.
     */

    public void setVehicleType(String par) {

        this.VehicleType = par;

    }


    /**
     * Returns the VehicleType of the ADVehicle.
     */

    public String getVehicleType() {

        return this.VehicleType;

    }


    /**
     * Assign a Width for this ADVehicle.
     */

    public void setWidth(String par) {

        this.Width = par;

    }


    /**
     * Returns the Width of the ADVehicle.
     */

    public String getWidth() {

        return this.Width;

    }


    /**
     * Assign a ADMake for this ADVehicle.
     */

    public void setADMake(String par) {

        this.ADMake = par;

    }


    /**
     * Returns the ADMake of the ADVehicle.
     */

    public String getADMake() {

        return this.ADMake;

    }


    /**
     * Returns the ADMake of the ADVehicle.
     * <p/>
     * Note: This is just a convenience method to make this
     * <p/>
     */

    public String getMake() {

        return this.ADMake;

    }


    /**
     * Assign a GroupId for this ADVehicle.
     */

    public void setGroupId(String par) {

        this.GroupId = par;

    }


    /**
     * Returns the GroupId of the ADVehicle.
     */

    public String getGroupId() {

        return this.GroupId;

    }


    /**
     * Assign a ADModel for this ADVehicle.
     */

    public void setADModel(String par) {

        this.ADModel = par;

    }


    /**
     * Returns the ADModel of the ADVehicle.
     */

    public String getADModel() {

        return this.ADModel;

    }


    /**
     * Returns the ADModel of the ADVehicle.
     * <p/>
     * Note: This is just a convenience method to make this
     * <p/>
     */

    public String getModel() {

        return this.ADModel;

    }


    /**
     * Assign a ADType for this ADVehicle.
     */

    public void setADType(String par) {

        this.ADType = par;

    }


    /**
     * Returns the ADType of the ADVehicle.
     */

    public String getADType() {

        return this.ADType;

    }


    /**
     * Assign a TyId for this ADVehicle.
     */

    public void setTyId(String par) {

        this.TyId = par;

    }


    /**
     * Returns the TyId of the ADVehicle.
     */

    public String getTyId() {

        return this.TyId;

    }


    /**
     * Assign a PriceDate for this ADVehicle.
     */

    public void setPriceDate(String par) {

        this.PriceDate = par;

    }


    /**
     * Returns the PriceDate of the ADVehicle.
     */

    public String getPriceDate() {

        return this.PriceDate;

    }


    /**
     * Assign a FirstYear for this ADVehicle.
     */

    public void setFirstYear(String par) {

        this.FirstYear = par;

    }


    /**
     * Returns the FirstYear of the ADVehicle.
     */

    public String getFirstYear() {

        return this.FirstYear;

    }


    /**
     * Assign a LastYear for this ADVehicle.
     */

    public void setLastYear(String par) {

        this.LastYear = par;

    }


    /**
     * Returns the LastYear of the ADVehicle.
     */

    public String getLastYear() {

        return this.LastYear;

    }


    /**
     * Assign a Speed for this ADVehicle.
     */

    public void setSpeed(String par) {

        this.Speed = par;

    }


    /**
     * Returns the Speed of the ADVehicle.
     */

    public String getSpeed() {

        return this.Speed;

    }


    /**
     * Assign a Accel for this ADVehicle.
     */

    public void setAccel(String par) {

        this.Accel = par;

    }


    /**
     * Returns the Accel of the ADVehicle.
     */

    public String getAccel() {

        return this.Accel;

    }


    /**
     * Assign a ADPower for this ADVehicle.
     */

    public void setADPower(String par) {

        this.ADPower = par;

    }


    /**
     * Returns the ADPower of the ADVehicle.
     */

    public String getADPower() {

        return this.ADPower;

    }


    /**
     * Assign a CylDisplacement for this ADVehicle.
     */

    public void setCylDisplacement(String par) {

        this.CylDisplacement = par;

    }


    /**
     * Returns the CylDisplacement of the ADVehicle.
     */

    public String getCylDisplacement() {

        return this.CylDisplacement;

    }


    /**
     * Assign a FuelCons1 for this ADVehicle.
     */

    public void setFuelCons1(String par) {

        this.FuelCons1 = par;

    }


    /**
     * Returns the FuelCons1 of the ADVehicle.
     */

    public String getFuelCons1() {

        return this.FuelCons1;

    }


    /**
     * Assign a FuelCons2 for this ADVehicle.
     */

    public void setFuelCons2(String par) {

        this.FuelCons2 = par;

    }


    /**
     * Returns the FuelCons2 of the ADVehicle.
     */

    public String getFuelCons2() {

        return this.FuelCons2;

    }


    /**
     * Assign a FuelCons4 for this ADVehicle.
     */

    public void setFuelCons4(String par) {

        this.FuelCons4 = par;

    }


    /**
     * Returns the FuelCons4 of the ADVehicle.
     */

    public String getFuelCons4() {

        return this.FuelCons4;

    }


    /**
     * Assign a Doors for this ADVehicle.
     */

    public void setDoors(String par) {

        this.Doors = par;

    }


    /**
     * Returns the Doors of the ADVehicle.
     */

    public String getDoors() {

        return this.Doors;

    }


    /**
     * Assign a AskPrice for this ADVehicle.
     */

    public void setAskPrice(String par) {

        this.AskPrice = par;

    }


    /**
     * Returns the AskPrice of the ADVehicle.
     */

    public String getAskPrice() {

        return this.AskPrice;

    }


    /**
     * Assign a SalePrice for this ADVehicle.
     */

    public void setSalePrice(String par) {

        this.SalePrice = par;

    }


    /**
     * Returns the SalePrice of the ADVehicle.
     */

    public String getSalePrice() {

        return this.SalePrice;

    }


    /**
     * Assign a PurchasePrice for this ADVehicle.
     */

    public void setPurchasePrice(String par) {

        this.PurchasePrice = par;

    }


    /**
     * Returns the PurchasePrice of the ADVehicle.
     */

    public String getPurchasePrice() {

        return this.PurchasePrice;

    }


    /**
     * Assign a NewPrice for this ADVehicle.
     */

    public void setNewPrice(String par) {

        this.NewPrice = par;

    }


    /**
     * Returns the NewPrice of the ADVehicle.
     */

    public String getNewPrice() {

        return this.NewPrice;

    }


    /**
     * Returns the QueryDate of the ADVehicle.
     */

    public String getQueryDate() {

        return this.QueryDate;

    }


    /**
     * Assign a QueryDate for this ADVehicle.
     */

    public void setQueryDate(String par) {

        this.QueryDate = par;

    }


    /**
     * Assign a CO2 for this ADVehicle.
     */

    public void setCO2(String par) {

        this.CO2 = par;

    }


    /**
     * Returns the CO2 of the ADVehicle.
     */

    public String getCO2() {

        return this.CO2;

    }


    /**
     * Assign a EmissionTax for this ADVehicle.
     */

    public void setEmissionTax(float par) {

        this.EmissionTax = par;

    }


    /**
     * Returns the EmissionTax of the ADVehicle.
     */

    public float getEmissionTax() {

        return this.EmissionTax;

    }


    /**
     * Assign a Id for this ADVehicle.
     */

    public void setId(String par) {

        this.Id = par;

    }


    /**
     * Returns the Id of this ADVehicle.
     */

    public String setId() {

        return this.Id;

    }


    /**
     * Assign a TimeStamp for this ADVehicle.
     */

    public void setTimeStamp(String par) {

        this.timeStamp = par;

    }


    /**
     * Returns the TimeStamp of this ADVehicle.
     */

    public String getTimeStampFormatted() {

        String retVal = this.timeStamp.substring(0, 10);


        retVal = retVal.substring(8, 10) + "." + retVal.substring(5, 7) + "." + retVal.substring(0, 4);


        return retVal;

    }


    /**
     * Assign a AKEDateLastUpdated for this ADVehicle.
     */

    public void setAKEDateLastUpdated(String par) {

        this.akeDateLastUpdated = par;

    }


    /**
     * Returns the AKEDateLastUpdated of the ADVehicle.
     */

    public String getAKEDateLastUpdated() {

        return this.akeDateLastUpdated;

    }


    /**
     * Returns the AKEDateLastUpdated of the ADVehicle.
     */

    public String getAKEDateLastUpdatedFormatted() {

        String retVal = "";

        try {

            retVal = this.akeDateLastUpdated.substring(0, 10);


            retVal = retVal.substring(8, 10) + "." + retVal.substring(5, 7) + "." + retVal.substring(0, 4);

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }


        return retVal;

    }


    /**
     * Assign a ParallelImport for this ADVehicle.
     */

    public void setParallelImport(String par) {

        this.parallelImport = par;

    }


    /**
     * Returns the ParallelImport of the ADVehicle.
     */

    public String getParallelImport() {

        return this.parallelImport;

    }


    /**
     * Assign a ADTypeList for this ADVehicle.
     */

    public void setADTypeList(String par) {

        this.ADTypeList = par;

    }


    /**
     * Returns the ADTypeList of the ADVehicle.
     */

    public String getADTypeList() {

        return this.ADTypeList;

    }


    public String getStatusLine() {

        return getADMake() + ";"

                + getADModel() + ";"

                + getADType() + ";"

                + getChassisNbr() + ";"

                + getColour() + ";"

                + getPower() + ";"

                + getCylVolume() + ";"

                + getNetWeight() + ";"

                + getGrossWeight() + ";"

                + getMOTDate();

    }







    public void setAKEErrorText(String par) {

        this.akeErrorText = par;

    }




    public void setAKEWarningText(String par) {

        this.akeWarningText = par;

    }




    public void setAtjLimitations(Vector par) {

        this.atjLimitations = par;

    }


    public Vector getAtjLimitations() {

        return this.atjLimitations;

    }


    public void setAtjSafetyEquipment(Vector par) {

        this.atjSafetyEquipment = par;

    }


    public Vector getAtjSafetyEquipment() {

        return this.atjSafetyEquipment;

    }


    public void setAtjTyres(Vector par) {

        this.atjTyres = par;

    }


    public Vector getAtjTyres() {

        return this.atjTyres;

    }

    public String getAkeErrorText() {
        return akeErrorText;
    }

    public void setAkeErrorText(String akeErrorText) {
        this.akeErrorText = akeErrorText;
    }

    public String getAkeWarningText() {
        return akeWarningText;
    }

    public void setAkeWarningText(String akeWarningText) {
        this.akeWarningText = akeWarningText;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getAkeDateLastUpdated() {
        return akeDateLastUpdated;
    }

    public void setAkeDateLastUpdated(String akeDateLastUpdated) {
        this.akeDateLastUpdated = akeDateLastUpdated;
    }

    public String getId() {
        return Id;
    }
}





