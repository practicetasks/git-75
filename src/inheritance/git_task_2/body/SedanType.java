package inheritance.git_task_2.body;

import inheritance.git_task_2.VehicleTypeByBodyTypes;
import inheritance.git_task_2.VehicleTypeEnum;

public class SedanType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}
