/*
 * Strava API v3
 * The [Swagger Playground](https://developers.strava.com/playground) is the easiest way to familiarize yourself with the Strava API by submitting HTTP requests and observing the responses before you write any client code. It will show what a response will look like with different endpoints depending on the authorization scope you receive from your athletes. To use the Playground, go to https://www.strava.com/settings/api and change your “Authorization Callback Domain” to developers.strava.com. Please note, we only support Swagger 2.0. There is a known issue where you can only select one scope at a time. For more information, please check the section “client code” at https://developers.strava.com/docs.
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package dev.lcw.run.generated.strava.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import dev.lcw.run.generated.strava.model.TimedZoneDistribution;
import java.io.IOException;

/**
 * ActivityZone
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-06T10:34:52.759+01:00")
public class ActivityZone {
  @SerializedName("score")
  private Integer score = null;

  @SerializedName("distribution_buckets")
  private TimedZoneDistribution distributionBuckets = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    HEARTRATE("heartrate"),
    
    POWER("power");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("sensor_based")
  private Boolean sensorBased = null;

  @SerializedName("points")
  private Integer points = null;

  @SerializedName("custom_zones")
  private Boolean customZones = null;

  @SerializedName("max")
  private Integer max = null;

  public ActivityZone score(Integer score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(value = "")
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public ActivityZone distributionBuckets(TimedZoneDistribution distributionBuckets) {
    this.distributionBuckets = distributionBuckets;
    return this;
  }

   /**
   * Get distributionBuckets
   * @return distributionBuckets
  **/
  @ApiModelProperty(value = "")
  public TimedZoneDistribution getDistributionBuckets() {
    return distributionBuckets;
  }

  public void setDistributionBuckets(TimedZoneDistribution distributionBuckets) {
    this.distributionBuckets = distributionBuckets;
  }

  public ActivityZone type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ActivityZone sensorBased(Boolean sensorBased) {
    this.sensorBased = sensorBased;
    return this;
  }

   /**
   * Get sensorBased
   * @return sensorBased
  **/
  @ApiModelProperty(value = "")
  public Boolean isSensorBased() {
    return sensorBased;
  }

  public void setSensorBased(Boolean sensorBased) {
    this.sensorBased = sensorBased;
  }

  public ActivityZone points(Integer points) {
    this.points = points;
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  @ApiModelProperty(value = "")
  public Integer getPoints() {
    return points;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }

  public ActivityZone customZones(Boolean customZones) {
    this.customZones = customZones;
    return this;
  }

   /**
   * Get customZones
   * @return customZones
  **/
  @ApiModelProperty(value = "")
  public Boolean isCustomZones() {
    return customZones;
  }

  public void setCustomZones(Boolean customZones) {
    this.customZones = customZones;
  }

  public ActivityZone max(Integer max) {
    this.max = max;
    return this;
  }

   /**
   * Get max
   * @return max
  **/
  @ApiModelProperty(value = "")
  public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityZone activityZone = (ActivityZone) o;
    return Objects.equals(this.score, activityZone.score) &&
        Objects.equals(this.distributionBuckets, activityZone.distributionBuckets) &&
        Objects.equals(this.type, activityZone.type) &&
        Objects.equals(this.sensorBased, activityZone.sensorBased) &&
        Objects.equals(this.points, activityZone.points) &&
        Objects.equals(this.customZones, activityZone.customZones) &&
        Objects.equals(this.max, activityZone.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, distributionBuckets, type, sensorBased, points, customZones, max);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityZone {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    distributionBuckets: ").append(toIndentedString(distributionBuckets)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sensorBased: ").append(toIndentedString(sensorBased)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    customZones: ").append(toIndentedString(customZones)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

