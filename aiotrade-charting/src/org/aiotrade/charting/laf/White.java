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
package org.aiotrade.charting.laf;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Caoyuan Deng
 */
public class White extends LookFeel {
    
    public White() {
        
        monthColors = new Color[] {
            Color.cyan.darker().darker().darker(),
            Color.cyan.darker().darker(),
            Color.yellow.darker().darker().darker(),
            Color.red.darker().darker().darker(),
            Color.red.darker().darker(),
            Color.yellow.darker().darker().darker(),
            Color.white.darker().darker().darker(),
            Color.white.darker().darker(),
            Color.yellow.darker().darker().darker(),
            Color.magenta.darker().darker().darker(),
            Color.magenta.darker().darker(),
            Color.yellow.darker().darker().darker()
        };
        
        planetColors = new Color[] {
            Color.magenta.darker(),
            Color.white.darker(),
            Color.blue.darker(),
            Color.red.darker(),
            Color.cyan.darker(),
            Color.yellow.darker(),
            Color.orange.darker().darker(),
            Color.green.darker().darker(),
            Color.gray.darker().darker(),
            Color.blue.darker()
        };
        
        chartColors = new Color[] {
            Color.PINK.darker(),             // Sun
            Color.BLUE.darker(),             // Mercury
            Color.BLACK,                     // Venus
            Color.GREEN.darker(),            // Earth
            Color.RED.darker(),              // Mars
            Color.CYAN.darker(),             // Jupiter
            Color.YELLOW.darker().darker(),  // Saturn
            Color.PINK.darker(),             // Uranus
            Color.LIGHT_GRAY,                // Neptune
            Color.MAGENTA.darker(),          // Pluto
            Color.DARK_GRAY,                 // MOON
            
            //                    Color.BLUE.darker(),
            //                    Color.YELLOW.darker(),
            //                    Color.CYAN.darker(),
            //                    Color.MAGENTA.darker(),
            //                    Color.PINK.darker(),
            //                    Color.ORANGE.darker(),
            //                    Color.BLACK,
            //                    Color.RED.darker(),
            //                    Color.GREEN.darker(),
        };
        
        axisFont = new Font("Dialog Input", Font.PLAIN, 9);
        
        systemBackgroundColor = new Color(212, 208, 200);
        
        nameColor = Color.BLACK;
        
        backgroundColor = Color.WHITE;
        
        axisBackgroundColor = systemBackgroundColor;
        
        stickChartColor = Color.BLUE.darker();
        
        positiveColor = Color.GREEN.darker();
        negativeColor = Color.RED.darker();
        
        positiveBgColor = Color.GREEN;
        negativeBgColor = Color.RED;
        
        borderColor = Color.BLACK;
        
        /** same as new Color(0.0f, 0.0f, 1.0f, 0.382f) */
        referCursorColor = new Color(0.0f, 0.5f, 0.5f, 0.382f); //new Color(0.5f, 0.0f, 0.5f, 0.618f); //new Color(0.0f, 0.0f, 1.0f, 0.618f);
        //new Color(131, 129, 221);
        
        /** same as new Color(1.0f, 1.0f, 1.0f, 0.618f) */
        mouseCursorColor = new Color(0.0f, 0.0f, 0.0f, 0.618f);
        //new Color(239, 237, 234);
        
        mouseCursorTextColor = Color.BLACK;
        mouseCursorTextBgColor = Color.YELLOW;
        referCursorTextColor = Color.WHITE;
        referCursorTextBgColor = referCursorColor.darker();
        
        drawingMasterColor = new Color(0, 0, 153); // new Color(128, 128, 255); //new Color(128, 0, 128);
        drawingColor = new Color(0, 0, 153); // new Color(128, 128, 255); //new Color(128, 0, 128);
        drawingColorTransparent = new Color(0.0f, 0.0f, 1.f, 0.382f); //new Color(128, 0, 128);
        handleColor = new Color(0, 0, 153); // new Color(128, 128, 255); //new Color(128, 0, 128);
        
        astrologyColor = Color.BLACK;
    }
    
}

