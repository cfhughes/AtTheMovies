package edu.cnm.deepdive.atthemovies.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(
        indices = {
                @Index(value = "name", unique = true)
        }
)
public class Actor implements Serializable {

    private static final long serialVersionUID = 1L;

    @PrimaryKey(autoGenerate = true)
    private Long id;

    @ColumnInfo(collate = ColumnInfo.NOCASE)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return name;
    }


}
