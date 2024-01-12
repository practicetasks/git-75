package inheritance.git_task_2.purpose;

import inheritance.git_task_2.VehicleTypeByPurpose;
import inheritance.git_task_2.VehicleTypeEnum;

public class CarType extends VehicleTypeByPurpose {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.CAR.name();
    }
}
