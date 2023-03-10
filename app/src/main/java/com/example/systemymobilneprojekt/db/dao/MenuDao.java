package com.example.systemymobilneprojekt.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.systemymobilneprojekt.db.tables.Menu;

import java.util.List;

@Dao
public interface MenuDao {
    @Query("SELECT * FROM menu")
    List<Menu> getAllMenu();

    @Insert
    void insertMenu(Menu... menu);

    @Delete
    void deleteMenu(Menu menu);
}
