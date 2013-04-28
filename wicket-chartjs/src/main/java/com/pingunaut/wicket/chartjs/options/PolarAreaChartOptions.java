package com.pingunaut.wicket.chartjs.options;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.pingunaut.wicket.chartjs.chart.impl.PolarArea;

/**
 * The Class PolarAreaChartOptions provides options, that are available for.
 * 
 * {@link PolarArea}.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public class PolarAreaChartOptions extends AbstractScalableChartOptions {

	/** The Constant serialVersionUID. */
	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;

	/** The scale show label backdrop. */
	private Boolean scaleShowLabelBackdrop;

	/** The scale backdrop color. */
	private String scaleBackdropColor;

	/** The scale backdrop padding y. */
	private Integer scaleBackdropPaddingY;

	/** The scale backdrop padding x. */
	private Integer scaleBackdropPaddingX;

	/** The segment show stroke. */
	private Boolean segmentShowStroke;

	/** The segment stroke color. */
	private String segmentStrokeColor;

	/** The segment stroke width. */
	private Integer segmentStrokeWidth;

	/** The animate rotate. */
	private Boolean animateRotate;

	/** The animate scale. */
	private Boolean animateScale;

	/**
	 * Gets the scale show label backdrop.
	 * 
	 * @return the scale show label backdrop
	 */
	public Boolean getScaleShowLabelBackdrop() {
		return scaleShowLabelBackdrop;
	}

	/**
	 * Sets the scale show label backdrop.
	 * 
	 * @param scaleShowLabelBackdrop
	 *            decides whether to show a backdrop to the scale label
	 */
	public void setScaleShowLabelBackdrop(Boolean scaleShowLabelBackdrop) {
		this.scaleShowLabelBackdrop = scaleShowLabelBackdrop;
	}

	/**
	 * Gets the scale backdrop color.
	 * 
	 * @return the scale backdrop color
	 */
	public String getScaleBackdropColor() {
		return scaleBackdropColor;
	}

	/**
	 * Sets the scale backdrop color.
	 * 
	 * @param scaleBackdropColor
	 *            the new scale backdrop color (default is
	 *            "rgba(255,255,255,0.75)").
	 */
	public void setScaleBackdropColor(String scaleBackdropColor) {
		this.scaleBackdropColor = scaleBackdropColor;
	}

	/**
	 * Gets the scale backdrop padding y.
	 * 
	 * @return the scale backdrop padding y
	 */
	public Integer getScaleBackdropPaddingY() {
		return scaleBackdropPaddingY;
	}

	/**
	 * Sets the scale backdrop padding y.
	 * 
	 * @param scaleBackdropPaddingY
	 *            the backdrop padding above & below the label in pixels
	 *            (default is 2).
	 */
	public void setScaleBackdropPaddingY(Integer scaleBackdropPaddingY) {
		this.scaleBackdropPaddingY = scaleBackdropPaddingY;
	}

	/**
	 * Gets the scale backdrop padding x.
	 * 
	 * @return the scale backdrop padding x
	 */
	public Integer getScaleBackdropPaddingX() {
		return scaleBackdropPaddingX;
	}

	/**
	 * Sets the scale backdrop padding x.
	 * 
	 * @param scaleBackdropPaddingX
	 *            the backdrop padding to the side of the label in pixels
	 *            (default is 2).
	 */
	public void setScaleBackdropPaddingX(Integer scaleBackdropPaddingX) {
		this.scaleBackdropPaddingX = scaleBackdropPaddingX;
	}

	/**
	 * Gets the segment show stroke.
	 * 
	 * @return the segment show stroke
	 */
	public Boolean getSegmentShowStroke() {
		return segmentShowStroke;
	}

	/**
	 * Sets the segment show stroke.
	 * 
	 * @param segmentShowStroke
	 *            decides whether we should show a stroke on each segment
	 *            (default is true)
	 */
	public void setSegmentShowStroke(Boolean segmentShowStroke) {
		this.segmentShowStroke = segmentShowStroke;
	}

	/**
	 * Gets the segment stroke color.
	 * 
	 * @return the segment stroke color
	 */
	public String getSegmentStrokeColor() {
		return segmentStrokeColor;
	}

	/**
	 * Sets the segment stroke color.
	 * 
	 * @param segmentStrokeColor
	 *            the new segment stroke color (default is "#fff").
	 */
	public void setSegmentStrokeColor(String segmentStrokeColor) {
		this.segmentStrokeColor = segmentStrokeColor;
	}

	/**
	 * Gets the segment stroke width.
	 * 
	 * @return the segment stroke width
	 */
	public Integer getSegmentStrokeWidth() {
		return segmentStrokeWidth;
	}

	/**
	 * Sets the segment stroke width.
	 * 
	 * @param segmentStrokeWidth
	 *            the new segment stroke width (default is 2).
	 */
	public void setSegmentStrokeWidth(Integer segmentStrokeWidth) {
		this.segmentStrokeWidth = segmentStrokeWidth;
	}

	/**
	 * Gets the animate rotate.
	 * 
	 * @return the animate rotate
	 */
	public Boolean getAnimateRotate() {
		return animateRotate;
	}

	/**
	 * Sets the animate rotate.
	 * 
	 * @param animateRotate
	 *            decides whether we animate the rotation of the pie (default is
	 *            true).
	 */
	public void setAnimateRotate(Boolean animateRotate) {
		this.animateRotate = animateRotate;
	}

	/**
	 * Gets the animate scale.
	 * 
	 * @return the animate scale
	 */
	public Boolean getAnimateScale() {
		return animateScale;
	}

	/**
	 * Sets the animate scale.
	 * 
	 * @param animateScale
	 *            decides whether we animate scaling the Pie from the center
	 *            (default is false).
	 */
	public void setAnimateScale(Boolean animateScale) {
		this.animateScale = animateScale;
	}
}
