package inheritance.git_task_2.purpose;

import inheritance.git_task_2.VehicleTypeByPurpose;
import inheritance.git_task_2.VehicleTypeEnum;

public class TruckType extends VehicleTypeByPurpose {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}
