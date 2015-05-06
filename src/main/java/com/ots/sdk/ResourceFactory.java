/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 OTS
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.ots.sdk;

import com.ots.sdk.resources.IAccountResource;
import com.ots.sdk.resources.IEmailResource;
import com.ots.sdk.resources.IMessageResource;
import com.ots.sdk.resources.IVerifyResource;
import com.ots.sdk.resources.IVoiceResource;
import com.ots.sdk.resources.http.AccountResourceImpl;
import com.ots.sdk.resources.http.EmailResourceImpl;
import com.ots.sdk.resources.http.MessagesResourceImpl;
import com.ots.sdk.resources.http.VerifyResourceImpl;
import com.ots.sdk.resources.http.VoiceResourceImpl;

/**
 *
 * @author Eri Setiawan
 */
public class ResourceFactory {

    public IAccountResource makeAccountResource(String appSid) {
        return new AccountResourceImpl(appSid);
    }

    public IEmailResource makeEmailResource(String appSid) {
        return new EmailResourceImpl(appSid);
    }

    public IVoiceResource makeVoiceResource(String appSid) {
        return new VoiceResourceImpl(appSid);
    }

    public IMessageResource makeMessageResource(String appSid) {
        return new MessagesResourceImpl(appSid);
    }

    public IVerifyResource makeVerifyResource(String appSid) {
        return new VerifyResourceImpl(appSid);
    }
}
