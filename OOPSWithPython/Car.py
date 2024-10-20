class Car:
    def __init__(self, brand, model):
        self.brand = brand
        self.model = model

    def display_info(self):
        return f"Car: {self.brand} {self.model}"

car1 = Car("Toyota", "Camry")
print(car1.display_info())
