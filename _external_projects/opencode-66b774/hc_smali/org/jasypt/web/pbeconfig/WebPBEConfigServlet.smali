.class public final Lorg/jasypt/web/pbeconfig/WebPBEConfigServlet;
.super Ljavax/servlet/http/HttpServlet;
.source ""


# static fields
.field private static final serialVersionUID:J = -0x63f1593bdeb7a17bL


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljavax/servlet/http/HttpServlet;-><init>()V

    return-void
.end method

.method private execute(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V
    .registers 15

    const-string v0, "Exception raised during servlet execution"

    :try_start_2
    invoke-static {}, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->getInstance()Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;

    move-result-object v1

    invoke-virtual {v1}, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->isWebConfigurationDone()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-static {}, Lorg/jasypt/web/pbeconfig/WebPBEConfigHtmlUtils;->createConfigurationDoneHtml()Ljava/lang/String;

    move-result-object p1

    :goto_10
    invoke-direct {p0, p1, p2}, Lorg/jasypt/web/pbeconfig/WebPBEConfigServlet;->writeResponse(Ljava/lang/String;Ljavax/servlet/http/HttpServletResponse;)V

    goto/16 :goto_143

    :cond_15
    const-string v2, "jasyptPwSetting"

    invoke-interface {p1, v2}, Ljavax/servlet/http/HttpServletRequest;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lorg/jasypt/commons/CommonUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_27

    invoke-static {p1, v3}, Lorg/jasypt/web/pbeconfig/WebPBEConfigHtmlUtils;->createInputFormHtml(Ljavax/servlet/http/HttpServletRequest;Z)Ljava/lang/String;

    move-result-object p1

    goto :goto_10

    :cond_27
    invoke-virtual {v1}, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->getConfigs()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_31
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7
    :try_end_35
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_35} :catch_152
    .catchall {:try_start_2 .. :try_end_35} :catchall_144

    const-string v8, "jasyptPw"

    if-eqz v7, :cond_9d

    :try_start_39
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/jasypt/encryption/pbe/config/WebPBEConfig;

    new-instance v9, Ljava/lang/StringBuffer;

    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    const-string v10, "jasyptVa"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {p1, v9}, Ljavax/servlet/http/HttpServletRequest;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {p1, v8}, Ljavax/servlet/http/HttpServletRequest;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    const-string v11, "jasyptRPw"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {p1, v10}, Ljavax/servlet/http/HttpServletRequest;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v9}, Lorg/jasypt/commons/CommonUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_9a

    invoke-static {v8}, Lorg/jasypt/commons/CommonUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_9a

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9a

    invoke-virtual {v7}, Lorg/jasypt/encryption/pbe/config/WebPBEConfig;->getValidationWord()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9a

    add-int/lit8 v5, v5, 0x1

    :cond_9a
    add-int/lit8 v6, v6, 0x1

    goto :goto_31

    :cond_9d
    new-instance v4, Ljava/text/SimpleDateFormat;

    invoke-direct {v4}, Ljava/text/SimpleDateFormat;-><init>()V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7
    :try_end_aa
    .catch Ljava/io/IOException; {:try_start_39 .. :try_end_aa} :catch_152
    .catchall {:try_start_39 .. :try_end_aa} :catchall_144

    const-string v9, "]"

    const-string v10, " ["

    const/4 v11, 0x1

    if-ge v5, v7, :cond_e4

    :try_start_b1
    invoke-virtual {p0}, Lorg/jasypt/web/pbeconfig/WebPBEConfigServlet;->getServletContext()Ljavax/servlet/ServletContext;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "Failed attempt to set PBE Configuration from "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p1}, Ljavax/servlet/http/HttpServletRequest;->getRemoteAddr()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v6}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljavax/servlet/ServletContext;->log(Ljava/lang/String;)V

    invoke-static {p1, v11}, Lorg/jasypt/web/pbeconfig/WebPBEConfigHtmlUtils;->createInputFormHtml(Ljavax/servlet/http/HttpServletRequest;Z)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_10

    :cond_e4
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_e8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_10d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/jasypt/encryption/pbe/config/WebPBEConfig;

    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v7, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {p1, v7}, Ljavax/servlet/http/HttpServletRequest;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Lorg/jasypt/encryption/pbe/config/SimplePBEConfig;->setPassword(Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_e8

    :cond_10d
    invoke-virtual {v1, v11}, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->setWebConfigurationDone(Z)V

    invoke-virtual {p0}, Lorg/jasypt/web/pbeconfig/WebPBEConfigServlet;->getServletContext()Ljavax/servlet/ServletContext;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "PBE Configuration succesfully set from "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p1}, Ljavax/servlet/http/HttpServletRequest;->getRemoteAddr()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v6}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ljavax/servlet/ServletContext;->log(Ljava/lang/String;)V

    invoke-static {}, Lorg/jasypt/web/pbeconfig/WebPBEConfigHtmlUtils;->createConfigurationDoneHtml()Ljava/lang/String;

    move-result-object p1
    :try_end_141
    .catch Ljava/io/IOException; {:try_start_b1 .. :try_end_141} :catch_152
    .catchall {:try_start_b1 .. :try_end_141} :catchall_144

    goto/16 :goto_10

    :goto_143
    return-void

    :catchall_144
    move-exception p1

    invoke-virtual {p0}, Lorg/jasypt/web/pbeconfig/WebPBEConfigServlet;->getServletContext()Ljavax/servlet/ServletContext;

    move-result-object p2

    invoke-interface {p2, v0, p1}, Ljavax/servlet/ServletContext;->log(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p2, Ljavax/servlet/ServletException;

    invoke-direct {p2, p1}, Ljavax/servlet/ServletException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_152
    move-exception p1

    invoke-virtual {p0}, Lorg/jasypt/web/pbeconfig/WebPBEConfigServlet;->getServletContext()Ljavax/servlet/ServletContext;

    move-result-object p2

    invoke-interface {p2, v0, p1}, Ljavax/servlet/ServletContext;->log(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_15c

    :goto_15b
    throw p1

    :goto_15c
    goto :goto_15b
.end method

.method private writeResponse(Ljava/lang/String;Ljavax/servlet/http/HttpServletResponse;)V
    .registers 3

    invoke-interface {p2}, Ljavax/servlet/http/HttpServletResponse;->getWriter()Ljava/io/PrintWriter;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->write(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/PrintWriter;->flush()V

    return-void
.end method


# virtual methods
.method public doGet(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lorg/jasypt/web/pbeconfig/WebPBEConfigServlet;->execute(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V

    return-void
.end method

.method public doPost(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lorg/jasypt/web/pbeconfig/WebPBEConfigServlet;->execute(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V

    return-void
.end method
