package be.sdutry.actions;

import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@ParentPackage("ssl-offload-default")
@Results({
  @Result(name=ActionSupport.SUCCESS, location="/b", type="sslOffloadRedirect")
})
public class AAction extends ActionSupport {
}
