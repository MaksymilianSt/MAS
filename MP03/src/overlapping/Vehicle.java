package overlapping;


import java.util.EnumSet;



public class Vehicle {
    private String name;
    private double maxUnderwaterDepth;
    private double maximumAltitudeInAir;
    private EnumSet<VehicleType> vehicleTypes = EnumSet.of(VehicleType.Vehicle);

    public Vehicle(String name, EnumSet<VehicleType> objTypes) {
        this.name = name;
        this.vehicleTypes.addAll(objTypes);
    }

    public double getMaximumAltitudeInAir() throws Exception {
        if(vehicleTypes.contains(VehicleType.Plane)){
            return maximumAltitudeInAir;
        }
        throw new Exception("This vehicle is not a plane");
    }

    public void setMaximumAltitudeInAir(double maximumAltitudeInAir) throws Exception {
        if(!vehicleTypes.contains(VehicleType.Plane)){
            throw new Exception("This vehicle is not a plane");
        }
        this.maximumAltitudeInAir = maximumAltitudeInAir;

    }

    public double getMaxUnderwaterDepth() throws Exception {
        if(vehicleTypes.contains(VehicleType.Submarine)){
            return maxUnderwaterDepth;
        }
        throw new Exception("This vehicle is not a Submarine");
    }

    public void setMaxUnderwaterDepth(double maxUnderwaterDepth) throws Exception {
        if(!vehicleTypes.contains(VehicleType.Submarine)){
            throw new Exception("This vehicle is not a Submarine");
        }
        this.maxUnderwaterDepth = maxUnderwaterDepth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumSet<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }
}
