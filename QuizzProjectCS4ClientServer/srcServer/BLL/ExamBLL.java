/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import java.io.FileNotFoundException;
import java.util.List;

import com.google.gson.Gson;

import DAL.ExamDAL;
import DAL.QuestionDAL;
import DAL.ResultDAL;
import DTO.ExamDTO;
import DTO.FullDataExamDTO;
import DTO.ResponseDTO;
import DTO.ResultDTO;


public class ExamBLL {
    private static ExamDAL examDal = new ExamDAL();
    private static QuestionDAL questionDAL = new QuestionDAL();
    private static ResultDAL resultDAL = new ResultDAL();
    private static Gson gson = new Gson();
    private int userID;
    public ExamBLL(){}

    public ExamBLL(int userID){
        this.userID=userID;
    }

    public ResponseDTO getListExam() {
        List<ExamDTO> listExam = examDal.findAll();
        return new ResponseDTO(200, gson.toJson(listExam), "");

    }
    
     public ResponseDTO  getExamByUserID(int userID){
         List<ExamDTO> listExam = examDal.findByUser(userID);
         return new ResponseDTO(200, gson.toJson(listExam), "");
     }
    
    public ResponseDTO addExamDTO(ExamDTO ex){
        try{
           int idExam= examDal.save(ex);
           ex.setId(idExam);
        } 
        catch(Exception e){
            return new ResponseDTO(400, "", "Add new exam failed!!!");
        }
        return new ResponseDTO(200, gson.toJson(ex), "Add Exam successfully!!!");
    }
    
    public ResponseDTO deleteExam(int id) throws Exception{
        try {
            ExamDTO exam = examDal.getById(id);
            if (exam.getStatus() == 1){
                return new ResponseDTO(400, "", "Can not delete this exam");
            }
            examDal.updateStatus(0, id);
        } catch (Exception e) {
            return  new ResponseDTO(400, "", "Can not delete this exam");
        }
        return  new ResponseDTO(200, "", "Delete Successfully!!!");
    }
    public ResponseDTO updateExam(FullDataExamDTO ex) throws FileNotFoundException {
        List<ResultDTO> listResult = resultDAL.getByExamId(ex.getId());

        if (listResult.size() != 0){
            return new ResponseDTO(400, "", "Đề đã được thi.");
        }

        examDal.update(ex);
        return new ResponseDTO(200, "", "Update Exam successfully!!!");
    }
}
