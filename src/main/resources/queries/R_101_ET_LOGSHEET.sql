USE [Job_No_99]
GO

/****** Object:  Table [dbo].[RT101_LOGSHEET_REV02_ET_LOG]    Script Date: 2023-10-27 13:24:15 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[R_101_ET_LOGSHEET](
	[ET_DATE_TIME] [datetime] NULL,
	[BATCH_NO] [nvarchar](50) NULL,
	[ACTIVITY] [nvarchar](50) NULL,
	[ET_WEIGHT] [real] NULL,
	[DT_WEIGHT] [real] NULL,
	[ET_AGT_RPM] [real] NULL,
	[ET_OPERATOR_NAME] [nvarchar](50) NULL,
	[SPARE1] [nvarchar](50) NULL,
	[SPARE2] [nvarchar](50) NULL,
	[SPARE3] [nvarchar](50) NULL,
	[SPARE4] [nvarchar](50) NULL,
	[SPARE5] [nvarchar](50) NULL
) ON [PRIMARY]
GO


