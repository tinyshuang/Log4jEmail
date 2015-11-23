# Log4jEmail

##这是一个配置log4j后..报错后会发送相应信息到相应邮件的Demo..

      `
         #define the logger
         log4j.logger.MailLog=WARN,Mail
         
         #set the mail part
         log4j.appender.Mail=org.apache.log4j.net.SMTPAppender
         #auth username
         log4j.appender.Mail.SMTPUsername=javav587@126.com
         #recevied
         log4j.appender.Mail.To=javav587@163.com
         #who send the mail which the same as the username
         log4j.appender.Mail.From=javav587@126.com
         #auth password
         log4j.appender.Mail.SMTPPassword=password
         #the mail subject
         log4j.appender.Mail.Subject=ErrorLog
         #stmp host
         log4j.appender.Mail.SMTPHost=smtp.126.com
         
         #log4j part
         log4j.appender.Mail.BufferSize=5
         log4j.appender.Mail.layout=org.apache.log4j.PatternLayout
         log4j.appender.Mail.layout.ConversionPattern=%-4r %-5p [%t] %37c %3x - %m%n
      `

