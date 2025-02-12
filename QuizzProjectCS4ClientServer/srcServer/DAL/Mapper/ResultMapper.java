/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.ResultDTO;

/**
 *
 * @author ThuanVo
 */
public class ResultMapper implements RowMapper<ResultDTO>{

    @Override
    public ResultDTO mapRow(ResultSet rs) {
        try {
            ResultDTO result = new ResultDTO();
            result.setId(rs.getInt("id"));
//            result.setExam_id(rs.getInt("exam_id"));
//            result.setUser_id(rs.getInt("user_id"));
            result.setScore(rs.getFloat("score"));
            return result;
        } catch (SQLException e) {
            return null;
        }
    }
}

