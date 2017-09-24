/*
 * Copyright 2017 Manuel Wrage
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ivianuu.rxsystemsettings.adapter;

import android.content.ContentResolver;
import android.provider.Settings;
import android.support.annotation.NonNull;

import com.ivianuu.rxsystemsettings.SettingsType;

/**
 * Reads and writes values from system settings
 */
public interface Adapter<T> {

    /**
     * Returns the value of this name
     */
    @NonNull
    T get(@NonNull String name,
          @NonNull ContentResolver contentResolver,
          @SettingsType int type) throws Settings.SettingNotFoundException;

    /**
     * Sets the value of this name
     */
    void set(@NonNull String name,
             @NonNull T value,
             @NonNull ContentResolver contentResolver,
             @SettingsType int type) throws Settings.SettingNotFoundException;
}