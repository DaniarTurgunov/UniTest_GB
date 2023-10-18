class Numberlists():
    """Класс для сравнения средних значений двух списков."""

    def __init__(self):
        """Инициализирует экземпляр класса"""
        self

    def get_list(self, list1):
        """Вычисляет и возвращает среднке значение списка."""
        try:
            return round(sum(list1) / len(list1), 2)
        
        except ZeroDivisionError:
            raise ZeroDivisionError("List is empty")
        
        except TypeError:
            raise TypeError("Incorrect input data")

    def compare_averages(self, average1, average2):
        """Сравнивает средние значения двух списков и выводит результат."""
        try:
            if average1 > average2:
                return "Первый список имеет большее ср. значение"
            elif average1 < average2:
                return "Второй список имеет большее ср. значение"
            else:
                return "Средние значения равны"

        except TypeError:
            raise TypeError("Incorrect average result")