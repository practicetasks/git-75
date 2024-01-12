package inheritance.git_task_2.body;

import inheritance.git_task_2.VehicleTypeByBodyTypes;
import inheritance.git_task_2.VehicleTypeEnum;

public class WagonType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}
