package org.example;

import org.assertj.core.util.Preconditions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.awt.*;

import static org.assertj.core.api.Assertions.*;

 class CatTest {

    @Test
    void shouldReturnTrueIfObjectsAreEquals() {
        Cat cat1 = new Cat(Color.GRAY, 5.8, "Felis catus");
        Cat cat2 = new Cat(Color.GRAY, 6.2, "Felis catus");
        assertThat(cat1.equals(cat2)).isTrue();
    }

    @Test
    void shouldReturnFalseIfObjectsAreNotEquals() {
        Cat cat1 = new Cat(Color.GRAY, 5.8, "Felis catus");
        Cat cat2 = new Cat(Color.GRAY, 6.2, "Prionailurus rubiginosus");
        assertThat(cat1.equals(cat2)).isFalse();
    }

    @Test
    void shouldThrowExceptionWhenObjectIsEmpty() {
        Cat cat1 = new Cat(Color.GRAY, 5.8, "Felis catus");
        Cat cat2 = new Cat();
        Throwable thrown = catchThrowable(() -> cat1.equals(cat2));
        assertThat(thrown).isInstanceOf(NullPointerException.class);
    }

    @ParameterizedTest
    @EnumSource(value = WeekDays.class, names = {"MON", "WED", "FRI"})
    void shouldReturnSleepOnCatSchedule(WeekDays weekDays) {
        Cat cat = new Cat();
        assertThat(cat.catWorkingSchedule(weekDays)).isEqualTo(cat.sleep());
        assertThat(cat.catWorkingSchedule(weekDays)).isEqualTo(cat.sleep());
        assertThat(cat.catWorkingSchedule(weekDays)).isEqualTo(cat.sleep());
    }

    @ParameterizedTest
    @EnumSource(value = WeekDays.class, names = {"TUE", "THU", "SAT"})
    void shouldReturnHuntOnCatSchedule(WeekDays weekDays) {
        Cat cat = new Cat();
        assertThat(cat.catWorkingSchedule(weekDays)).isEqualTo(cat.hunt());
        assertThat(cat.catWorkingSchedule(weekDays)).isEqualTo(cat.hunt());
        assertThat(cat.catWorkingSchedule(weekDays)).isEqualTo(cat.hunt());
    }

    @ParameterizedTest
    @EnumSource(value = WeekDays.class, names = {"SUN"})
    void shouldReturnTigidikOnCatSchedule(WeekDays weekDays) {
        Cat cat = new Cat();
        assertThat(cat.catWorkingSchedule(weekDays)).isEqualTo(cat.doSomethingIncomprehensible());
    }
}