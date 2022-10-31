from car import Car


if __name__ == "__main__":

    print("Hello Bitch")
    
    car = Car()
    car.license = "EGW649"
    car.driver = "Angel Sandoval"
    print(vars(car))

    car2 = Car()
    car2.license = "SEY649"
    car2.driver = "Martha Sandoval"
    print(vars(car2))