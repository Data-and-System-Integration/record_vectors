package com.shubhi.record_vectors;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class vectors_object implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.util.List<java.lang.String> data_bus_dim;
	private java.math.BigDecimal data_ppmonth;
	private java.util.List<java.lang.String> dim_name;
	private java.util.List<java.math.BigDecimal> dim_levels__level_0;
	private java.util.List<java.math.BigDecimal> dim_levels__level_1;

	public vectors_object() {
	}

	public java.util.List<java.lang.String> getData_bus_dim() {
		return this.data_bus_dim;
	}

	public void setData_bus_dim(java.util.List<java.lang.String> data_bus_dim) {
		this.data_bus_dim = data_bus_dim;
		for(String vec_rec : data_bus_dim)
		{
		    String[] sub_rec=vec_rec.split(";");
		    this.dim_name.add(sub_rec[0]);
		    this.dim_levels__level_0.add(new java.math.BigDecimal(sub_rec[1]));
		    this.dim_levels__level_1.add(new java.math.BigDecimal(sub_rec[2]));
		}
	}

	public java.math.BigDecimal getData_ppmonth() {
		return this.data_ppmonth;
	}

	public void setData_ppmonth(java.math.BigDecimal data_ppmonth) {
		this.data_ppmonth = data_ppmonth;
	}

	public vectors_object(java.util.List<java.lang.String> data_bus_dim,
			java.math.BigDecimal data_ppmonth) {
		this.data_bus_dim = data_bus_dim;
		this.data_ppmonth = data_ppmonth;
	}
	


}