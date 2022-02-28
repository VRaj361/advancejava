package com.dao;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import com.bean.AddProjectBeanDB;
import com.util.Web;

public class AddProjectDao {
	public void insertData(AddProjectBeanDB beandb) {
		
		try {
			
			Connection con=Web.getConnection();
			System.out.println("doa in");
			PreparedStatement pst=con.prepareStatement("insert into projects (title,description) values (?,?)");
			pst.setString(1, beandb.getTitle());
			pst.setString(2, beandb.getDescription());
			int record =pst.executeUpdate();//dml command update here 
			System.out.println(record+" is inserted");
			
			//error occur when the try block execute the first sysout can run the second sysout not work becuase of data base connection
			
			
		}catch(Exception e) {
			System.out.println("error dao");
			e.printStackTrace();
		}
	}
	
	public ArrayList<AddProjectBeanDB> getAllProjects(){
		ArrayList<AddProjectBeanDB> project=new ArrayList<AddProjectBeanDB>();
		try {
			Connection con=Web.getConnection();
			PreparedStatement pst=con.prepareStatement("select * from projects");
			System.out.println("pst"+pst);
			ResultSet rs=pst.executeQuery();//this is query which is store the select product
			System.out.println(rs);
			while(rs.next()) {
				System.out.println("in while loop");
				int projectId=rs.getInt("projectid");
				String title=rs.getString("title");
				String description=rs.getString("description") ;
				AddProjectBeanDB beandb=new AddProjectBeanDB();
				beandb.setProjectId(projectId);
				beandb.setTitle(title);
				beandb.setDescription(description);
				project.add(beandb);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("project "+project);
		return project;
	}
	
	public  void deleteRecord(int projectId) {
		try(Connection con=Web.getConnection();
			PreparedStatement pre=con.prepareStatement("delete from projects where projectid=?");) {
			
			pre.setInt(1, projectId);
			int status=pre.executeUpdate();
			System.out.println(status+" can deleted");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<AddProjectBeanDB> searchData(String str){
		ArrayList<AddProjectBeanDB> projects=new ArrayList<AddProjectBeanDB>();
		System.out.println("fasdfd");
		try {
			Connection con=Web.getConnection();
			PreparedStatement pr=con.prepareStatement("select * from projects where title like ?");
			pr.setString(1, str+"%");
			
			ResultSet rs=pr.executeQuery();
			while(rs.next()) {
				int projectId=rs.getInt("projectid");
				String title=rs.getString("title");
				String description=rs.getString("description");
				AddProjectBeanDB bean=new AddProjectBeanDB();
				bean.setProjectId(projectId);
				bean.setTitle(title);
				bean.setDescription(description);
				projects.add(bean);
			}
			System.out.println("dfadfadfadf");
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		return projects;
	}
	
	
	public AddProjectBeanDB getUpdateData(int projectid){
		
		AddProjectBeanDB bean=new AddProjectBeanDB();
		try {
			Connection con=Web.getConnection();
			PreparedStatement pr=con.prepareStatement("select * from projects where projectid =  ?");
			pr.setInt(1, projectid);
			
			ResultSet rs=pr.executeQuery();
			while(rs.next()) {
				int projectId=rs.getInt("projectid");
				String title=rs.getString("title");
				String description=rs.getString("description");
				
				bean.setProjectId(projectId);
				bean.setTitle(title);
				bean.setDescription(description);
				
			}
			System.out.println("dfadfadfadf");
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
	
	
	public void updateValue(AddProjectBeanDB bean) {
		try(Connection con=Web.getConnection();
				PreparedStatement pr=con.prepareStatement("update projects set title = ?,description =? where projectid=?");){
			
			pr.setString(1, bean.getTitle());
			pr.setString(2,bean.getDescription());
			pr.setInt(3, bean.getProjectId());
			
			pr.executeUpdate();
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
