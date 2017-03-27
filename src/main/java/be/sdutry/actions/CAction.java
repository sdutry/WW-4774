package be.sdutry.actions;

import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
  @Result(name=ActionSupport.SUCCESS, location="b", type="redirectAction")
})
public class CAction extends ActionSupport {
}
