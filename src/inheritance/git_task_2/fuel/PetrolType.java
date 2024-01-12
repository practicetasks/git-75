package inheritance.git_task_2.fuel;

import inheritance.git_task_2.VehicleTypeByFuelTypes;
import inheritance.git_task_2.VehicleTypeEnum;

public class PetrolType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
