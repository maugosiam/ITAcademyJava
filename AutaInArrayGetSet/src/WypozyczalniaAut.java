public class WypozyczalniaAut {

    public WypozyczalniaAut() {
    }

    Car[] wypozyczAuto(Car car[]){
        for(int i = 0; i<10; i++){
            if(car[i].isWypozyczony() == false && car[i].getKolor() == "granatowy" ){
                car[i].setWypozyczony(true);
                System.out.println("\n----------------\nOd tego momentu wypożyczony/a jest: "+car[i].getKolor()+" "+car[i].getMarka()+" o numerach rejestracyjnych: "+car[i].getNrRejestracyjny());
            }
        }
        return car;
    }

    Car[] zwrocAuto(Car car[]){
        for(int i = 0; i<car.length; i++){
            if(car[i].isWypozyczony() == true && car[i].getMarka() == "Toyota" ){
                car[i].setWypozyczony(false);
                System.out.println("\n-----------------\nWłaśnie zwrócono auto marki: "+car[i].getMarka()+" o numerach rejestracyjnych: "+car[i].getNrRejestracyjny());
            }
        }
        return car;
    }

    Car[] dodajAutoDoWypozyczalni(Car car[], Car noweAuto) {
        Car[] newCar = new Car[car.length + 1];
        for (int i = 0; i < car.length; i++) {
            newCar[i] = car[i];
        }
        newCar[newCar.length - 1] = noweAuto;
        //car = newCar;
        System.out.println("\n-----------------------------\nWłaśnie dodano do bazy nowe auto: "+car[car.length-1]+"\n");
        return newCar;
    }


}
