/**
  * Wire
  * Copyright (C) 2018 Wire Swiss GmbH
  *
  * This program is free software: you can redistribute it and/or modify
  * it under the terms of the GNU General Public License as published by
  * the Free Software Foundation, either version 3 of the License, or
  * (at your option) any later version.
  *
  * This program is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  * GNU General Public License for more details.
  *
  * You should have received a copy of the GNU General Public License
  * along with this program.  If not, see <http://www.gnu.org/licenses/>.
  */
package com.waz.zclient.utils

import java.io.File

import android.content.Context
import android.net.Uri
import android.support.v4.content.FileProvider

class ExternalFileSharing(context: Context) {

  def defaultAuthority: String = s"${context.getPackageName}.fileprovider"

  /**
    * Uses FileProvider for creating content Uri for sharing.
    *
    * @param file should belongs to the paths, which are registered
    *             inside the '/res/xml/provider_paths.xml'
    * @param authority should match with registered FileProvider's authority
    */
  def getUriForFile(file: File, authority: String = defaultAuthority): Uri =
    FileProvider.getUriForFile(context, authority, file)

}
