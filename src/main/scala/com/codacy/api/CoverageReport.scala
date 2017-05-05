package com.codacy.api

case class CoverageFileReport(filename: String, total: Int, coverage: Map[Int,Int])

case class CoverageReport(total: Int, fileReports: Seq[CoverageFileReport])
