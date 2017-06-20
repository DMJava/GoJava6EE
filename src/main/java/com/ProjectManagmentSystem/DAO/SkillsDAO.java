package com.ProjectManagmentSystem.DAO;

import com.ProjectManagmentSystem.Skills;

import java.util.List;

/**
 * Created by pc on 20.06.2017.
 */
public interface SkillsDAO {
    //CREATE
    void add(Skills skills);

    //READ
    List<Skills> getAll();

    Skills getbyId(int skill_id);

    //UPDATE
    void update(Skills skills);

    //DELETE
    void remove(Skills skills);
}
