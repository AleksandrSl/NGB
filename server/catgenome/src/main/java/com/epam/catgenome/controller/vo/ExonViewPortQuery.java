/*
 * MIT License
 *
 * Copyright (c) 2016 EPAM Systems
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.epam.catgenome.controller.vo;

/**
 * Source:      ExonViewPortQuery
 * Created:     06.10.16, 15:02
 * Project:     CATGenome Browser
 * Make:        IntelliJ IDEA 14.1.4, JDK 1.8
 *
 * <p>
 * A query object, describing exon queries in a viewport. Center position and viewport size in bps should be provided.
 * </p>
 * @author Mikhail Miroliubov
 */
public class ExonViewPortQuery extends AbstractExonQuery {
    /**
     * Size of a screen in bp
     */
    private Integer viewPortSize;

    /**
     * Position of the center of the screen on reference genome
     */
    private Integer centerPosition;


    public Integer getViewPortSize() {
        return viewPortSize;
    }

    public void setViewPortSize(Integer viewPortSize) {
        this.viewPortSize = viewPortSize;
    }

    public Integer getCenterPosition() {
        return centerPosition;
    }

    public void setCenterPosition(Integer centerPosition) {
        this.centerPosition = centerPosition;
    }
}
