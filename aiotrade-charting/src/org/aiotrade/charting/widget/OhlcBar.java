/*
 * Copyright (c) 2006-2007, AIOTrade Computing Co. and Contributors
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 *  o Redistributions of source code must retain the above copyright notice, 
 *    this list of conditions and the following disclaimer. 
 *    
 *  o Redistributions in binary form must reproduce the above copyright notice, 
 *    this list of conditions and the following disclaimer in the documentation 
 *    and/or other materials provided with the distribution. 
 *    
 *  o Neither the name of AIOTrade Computing Co. nor the names of 
 *    its contributors may be used to endorse or promote products derived 
 *    from this software without specific prior written permission. 
 *    
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR 
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR 
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, 
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, 
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; 
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR 
 * OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.aiotrade.charting.widget;

import java.awt.geom.GeneralPath;
import org.aiotrade.charting.widget.WidgetModel;
import org.aiotrade.charting.widget.OhlcBar.Model;

/**
 *
 * @author  Caoyuan Deng
 * @version 1.0, November 27, 2006, 10:13 PM
 * @since   1.0.4
 */
public class OhlcBar extends PathWidget<Model> {
    public final static class Model implements WidgetModel {
        float xCenter;
        float yOpen;
        float yHigh;
        float yLow;
        float yClose;
        float width;
        
        public void set(float xCenter, float yOpen, float yHigh, float yLow, float yClose, float width) {
            this.xCenter = xCenter;
            this.yOpen = yOpen;
            this.yHigh = yHigh;
            this.yLow = yLow;
            this.yClose = yClose;
            this.width = width;
        }
    }
    
    public OhlcBar() {
        super();
    }
    
    protected Model createModel() {
        return new Model();
    }
    
    /**
     *         12341234
     *          |
     *         -+   |
     *          |   +-
     *          +- -+
     *              |
     *
     *          ^   ^
     *          |___|___ barCenter
     */
    protected void plotWidget() {
        final Model model = model();
        final GeneralPath path = getPath();
        path.reset();
        
        /** why - 2 ? 1 for centre, 1 for space */
        final float xRadius = model.width < 2 ? 0 : (model.width - 2) / 2;
        
        if (model.width <= 2) {
            path.moveTo(model.xCenter, model.yHigh);
            path.lineTo(model.xCenter, model.yLow);
        } else {
            path.moveTo(model.xCenter, model.yHigh);
            path.lineTo(model.xCenter, model.yLow);
            
            path.moveTo(model.xCenter - xRadius, model.yOpen);
            path.lineTo(model.xCenter, model.yOpen);
            
            path.moveTo(model.xCenter, model.yClose);
            path.lineTo(model.xCenter + xRadius, model.yClose);
        }
        
    }
    
}
