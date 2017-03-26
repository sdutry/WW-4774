package be.sdutry.actions;

import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
  @Result(name=ActionSupport.SUCCESS, location="/b", type="redirect")
})
public class AAction extends ActionSupport {
}
