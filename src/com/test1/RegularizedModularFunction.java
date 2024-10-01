package com.test1;

public class RegularizedModularFunction {
	private String functionCode;
	private String functionName;
	private String moduleParameters;
	private String serverlessModule;
	private String lambdaName;
	private String environmentVariables;
	private String systemvariables;
	private Integer modularTestData;
	private String modulevariablePrediction;
	private String validDataSample;
	private String moduleState;

	public RegularizedModularFunction() {

	}

	public RegularizedModularFunction(String functionCode, String functionName, String moduleParameters,
			String serverlessModule, String lambdaName, String environmentVariables, String systemvariables,
			Integer modularTestData, String modulevariablePrediction, String validDataSample, String moduleState) {
		super();
		this.functionCode = functionCode;
		this.functionName = functionName;
		this.moduleParameters = moduleParameters;
		this.serverlessModule = serverlessModule;
		this.lambdaName = lambdaName;
		this.environmentVariables = environmentVariables;
		this.systemvariables = systemvariables;
		this.modularTestData = modularTestData;
		this.modulevariablePrediction = modulevariablePrediction;
		this.validDataSample = validDataSample;
		this.moduleState = moduleState;
	}

	public String getFunctionCode() {
		return functionCode;
	}

	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getModuleParameters() {
		return moduleParameters;
	}

	public void setModuleParameters(String moduleParameters) {
		this.moduleParameters = moduleParameters;
	}

	public String getServerlessModule() {
		return serverlessModule;
	}

	public void setServerlessModule(String serverlessModule) {
		this.serverlessModule = serverlessModule;
	}

	public String getLambdaName() {
		return lambdaName;
	}

	public void setLambdaName(String lambdaName) {
		this.lambdaName = lambdaName;
	}

	public String getEnvironmentVariables() {
		return environmentVariables;
	}

	public void setEnvironmentVariables(String environmentVariables) {
		this.environmentVariables = environmentVariables;
	}

	public String getSystemvariables() {
		return systemvariables;
	}

	public void setSystemvariables(String systemvariables) {
		this.systemvariables = systemvariables;
	}

	public Integer getModularTestData() {
		return modularTestData;
	}

	public void setModularTestData(Integer modularTestData) {
		this.modularTestData = modularTestData;
	}

	public String getModulevariablePrediction() {
		return modulevariablePrediction;
	}

	public void setModulevariablePrediction(String modulevariablePrediction) {
		this.modulevariablePrediction = modulevariablePrediction;
	}

	public String getValidDataSample() {
		return validDataSample;
	}

	public void setValidDataSample(String validDataSample) {
		this.validDataSample = validDataSample;
	}

	public String getModuleState() {
		return moduleState;
	}

	public void setModuleState(String moduleState) {
		this.moduleState = moduleState;
	}

}
