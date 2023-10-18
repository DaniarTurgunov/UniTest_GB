from unittest import TestCase
import pytest

from NumLists import Numberlists


class TestNumListsCorrect(TestCase):
    """Проверка средних значений списков"""
    list1 = [1, 2, 3, 4, 5]
    list2 = [2, 3, 4, 5, 6]
    nums_lists = Numberlists()

    def test_num_lists_correct_input_data(self):
        """Проверка средних значений списков"""
        assert self.nums_lists.get_list(self.list1) == 3
        assert self.nums_lists.get_list(self.list2) == 4


class TestNumListsEmptyList(TestCase):
    """Проверка работы с пустым списком"""
    nums_lists = Numberlists()
    list_empty = []

    def test_num_lists_empty_list(self):
        """Проверка работы с пустым списком"""
        with pytest.raises(ZeroDivisionError):
            self.nums_lists.get_list(self.list_empty)


class TestNumListsIncorrectDataList(TestCase):
    """Проверка работы с некорректным списком данных"""
    nums_lists = Numberlists()
    list_incorrect = ['a', 'b', '/']

    def test_num_lists_incorrect_data(self):
        """Проверка работыс некорректным списком данных"""
        with pytest.raises(TypeError):
            self.nums_lists.get_list(self.list_incorrect)


class TestNumListsIncorrectData(TestCase):
    """Проверка работы метода с некорректными данными"""
    nums_lists = Numberlists()
    not_list = 2

    def test_num_lists_incorrect_data(self):
        """Проверка работы метода с некорректными данными"""
        with pytest.raises(TypeError):
            self.nums_lists.get_list(self.not_list)


class TestNumListsAverage1(TestCase):
    """Проверка сообщения когда среднее значение первого списка больше второго"""
    nums_lists = Numberlists()

    def test_compare_averages_list1_average_larger(self):
        """Проверка сообщения когда среднее значение первого списка больше второго"""
        assert self.nums_lists.compare_averages(4, 3) == 'Первый список имеет большее ср. значение'


class TestNumListsAverage2(TestCase):
    """Проверка сообщения когда среднее значение второго списка больше первого"""
    nums_lists = Numberlists()

    def test_compare_averages_list2_average_larger(self):
        """Проверка сообщения когда среднее значение второго списка больше первого"""
        assert self.nums_lists.compare_averages(3, 4) == 'Второй список имеет большее ср. значение'


class TestNumListsAveragesEqual(TestCase):
    """Проверка то что средние значения списков равны"""
    nums_lists = Numberlists()

    def test_compare_averages_equal(self):
        """Проверка то что средние значения списков равны"""
        assert self.nums_lists.compare_averages(3, 3) == 'Средние значения равны'