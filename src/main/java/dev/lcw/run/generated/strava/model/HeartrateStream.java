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
import dev.lcw.run.generated.strava.model.BaseStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HeartrateStream
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-06T10:34:52.759+01:00")
public class HeartrateStream {
  @SerializedName("original_size")
  private Integer originalSize = null;

  /**
   * The level of detail (sampling) in which this stream was returned
   */
  @JsonAdapter(ResolutionEnum.Adapter.class)
  public enum ResolutionEnum {
    LOW("low"),
    
    MEDIUM("medium"),
    
    HIGH("high");

    private String value;

    ResolutionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResolutionEnum fromValue(String text) {
      for (ResolutionEnum b : ResolutionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ResolutionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResolutionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResolutionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ResolutionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("resolution")
  private ResolutionEnum resolution = null;

  /**
   * The base series used in the case the stream was downsampled
   */
  @JsonAdapter(SeriesTypeEnum.Adapter.class)
  public enum SeriesTypeEnum {
    DISTANCE("distance"),
    
    TIME("time");

    private String value;

    SeriesTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SeriesTypeEnum fromValue(String text) {
      for (SeriesTypeEnum b : SeriesTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SeriesTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SeriesTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SeriesTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SeriesTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("series_type")
  private SeriesTypeEnum seriesType = null;

  @SerializedName("data")
  private List<Integer> data = null;

  public HeartrateStream originalSize(Integer originalSize) {
    this.originalSize = originalSize;
    return this;
  }

   /**
   * The number of data points in this stream
   * @return originalSize
  **/
  @ApiModelProperty(value = "The number of data points in this stream")
  public Integer getOriginalSize() {
    return originalSize;
  }

  public void setOriginalSize(Integer originalSize) {
    this.originalSize = originalSize;
  }

  public HeartrateStream resolution(ResolutionEnum resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * The level of detail (sampling) in which this stream was returned
   * @return resolution
  **/
  @ApiModelProperty(value = "The level of detail (sampling) in which this stream was returned")
  public ResolutionEnum getResolution() {
    return resolution;
  }

  public void setResolution(ResolutionEnum resolution) {
    this.resolution = resolution;
  }

  public HeartrateStream seriesType(SeriesTypeEnum seriesType) {
    this.seriesType = seriesType;
    return this;
  }

   /**
   * The base series used in the case the stream was downsampled
   * @return seriesType
  **/
  @ApiModelProperty(value = "The base series used in the case the stream was downsampled")
  public SeriesTypeEnum getSeriesType() {
    return seriesType;
  }

  public void setSeriesType(SeriesTypeEnum seriesType) {
    this.seriesType = seriesType;
  }

  public HeartrateStream data(List<Integer> data) {
    this.data = data;
    return this;
  }

  public HeartrateStream addDataItem(Integer dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<Integer>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * The sequence of heart rate values for this stream, in beats per minute
   * @return data
  **/
  @ApiModelProperty(value = "The sequence of heart rate values for this stream, in beats per minute")
  public List<Integer> getData() {
    return data;
  }

  public void setData(List<Integer> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeartrateStream heartrateStream = (HeartrateStream) o;
    return Objects.equals(this.originalSize, heartrateStream.originalSize) &&
        Objects.equals(this.resolution, heartrateStream.resolution) &&
        Objects.equals(this.seriesType, heartrateStream.seriesType) &&
        Objects.equals(this.data, heartrateStream.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalSize, resolution, seriesType, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeartrateStream {\n");
    
    sb.append("    originalSize: ").append(toIndentedString(originalSize)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    seriesType: ").append(toIndentedString(seriesType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

