package inheritance.git_task_2;

import inheritance.git_task_2.body.PickupType;
import inheritance.git_task_2.body.SedanType;
import inheritance.git_task_2.fuel.DieselType;
import inheritance.git_task_2.fuel.PetrolType;
import inheritance.git_task_2.purpose.CarType;
import inheritance.git_task_2.purpose.PassengerType;
import inheritance.git_task_2.purpose.TruckType;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
                new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickupType(), new DieselType());

        VehicleAd testAd = new VehicleAd("test", "999", new CarType(), new SedanType(), new PetrolType());

        adsService.setAdList(new VehicleAd[]{volvoAd, kamazAd, testAd});

        adsService.filterByVehicleTypeByPurpose(new PassengerType());

        adsService.filterByVehicleTypeByPurpose(new TruckType());

        //TODO Создайте объявление с типами CAR, SEDAN, PETROL и отфильтруйте объявления с бензиновым топливом

        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());

    }
}
