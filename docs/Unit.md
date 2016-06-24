
# Unit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Unit name | 
**abbreviatedName** | **String** | Unit abbreviation | 
**category** | [**CategoryEnum**](#CategoryEnum) | Unit category | 
**minimumValue** | **Double** | The smallest acceptable value for measurements using this unit |  [optional]
**maximumValue** | **Double** | The largest acceptable value for measurements using this unit |  [optional]
**conversionSteps** | [**List&lt;ConversionStep&gt;**](ConversionStep.md) | Conversion steps list | 


<a name="CategoryEnum"></a>
## Enum: CategoryEnum
Name | Value
---- | -----
DISTANCE | &quot;Distance&quot;
DURATION | &quot;Duration&quot;
ENERGY | &quot;Energy&quot;
FREQUENCY | &quot;Frequency&quot;
MISCELLANY | &quot;Miscellany&quot;
PRESSURE | &quot;Pressure&quot;
PROPORTION | &quot;Proportion&quot;
RATING | &quot;Rating&quot;
TEMPERATURE | &quot;Temperature&quot;
VOLUME | &quot;Volume&quot;
WEIGHT | &quot;Weight&quot;



