package ${package_pojo};
<#if swagger==true>
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
</#if>
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
/****
 * @Author:shenkunlin
 * @Description:${Table}构建
 * @Date 2019/6/14 19:13
 *****/
<#if swagger==true>
@ApiModel(description = "${Table}",value = "${Table}")
</#if>
@Table(name="${TableName}")
public class ${Table} implements Serializable{

<#list models as model>
	<#if swagger==true>
	@ApiModelProperty(value = "${model.desc!""}",required = false)
	</#if>
	<#if model.id==true>
	@Id
	</#if>
	private ${model.simpleType} ${model.name};//${model.desc!""}
</#list>


<#list models as model>
	//get方法
	public ${model.simpleType} get${model.upperName}() {
		return ${model.name};
	}

	//set方法
	public void set${model.upperName}(${model.simpleType} ${model.name}) {
		this.${model.name} = ${model.name};
	}
</#list>


}
