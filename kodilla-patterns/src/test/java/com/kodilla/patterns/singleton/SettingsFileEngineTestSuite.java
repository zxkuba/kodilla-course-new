package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SettingsFileEngineTestSuite {

    @BeforeAll
    public static void openSettingsFile() {
        SettingsFileEngine.getInstance().open("myapp.settings");
    }

    @AfterAll
    public static void closeSettingsFile() {
        SettingsFileEngine.getInstance().close();
    }

    @Test
    public void testGetFileName() {
        //Given
        //When
        String fileName = SettingsFileEngine.getInstance().getFileName();
        System.out.println("Opened: " + fileName);
        //Then
        assertEquals("myapp.settings", fileName);
    }

    @Test
    public void testLoadSettings() {
        //Given
        //When
        boolean result = SettingsFileEngine.getInstance().loadSettings();
        //Then
        assertTrue(result);
    }

    @Test
    public void testSaveSettings() {
        //Given
        //When
        boolean result = SettingsFileEngine.getInstance().saveSettings();
        //Then
        assertTrue(result);
    }
}
