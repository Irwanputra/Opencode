.class public final Lorg/jasypt/web/pbeconfig/WebPBEInitializationContextListener;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljavax/servlet/ServletContextListener;


# static fields
.field public static final INIT_PARAM_INITIALIZER_CLASS_NAME:Ljava/lang/String; = "webPBEInitializerClassName"

.field public static synthetic class$org$jasypt$web$pbeconfig$WebPBEInitializer:Ljava/lang/Class;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic class$(Ljava/lang/String;)Ljava/lang/Class;
    .registers 2

    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_4} :catch_5

    return-object p0

    :catch_5
    move-exception p0

    new-instance v0, Ljava/lang/NoClassDefFoundError;

    invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public contextDestroyed(Ljavax/servlet/ServletContextEvent;)V
    .registers 2

    return-void
.end method

.method public contextInitialized(Ljavax/servlet/ServletContextEvent;)V
    .registers 6

    invoke-virtual {p1}, Ljavax/servlet/ServletContextEvent;->getServletContext()Ljavax/servlet/ServletContext;

    move-result-object p1

    const-string v0, "webPBEInitializerClassName"

    invoke-interface {p1, v0}, Ljavax/servlet/ServletContext;->getInitParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/jasypt/commons/CommonUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7a

    :try_start_10
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_1c
    .catch Ljava/lang/ClassNotFoundException; {:try_start_10 .. :try_end_1c} :catch_73

    sget-object v1, Lorg/jasypt/web/pbeconfig/WebPBEInitializationContextListener;->class$org$jasypt$web$pbeconfig$WebPBEInitializer:Ljava/lang/Class;

    const-string v2, "org.jasypt.web.pbeconfig.WebPBEInitializer"

    if-nez v1, :cond_28

    invoke-static {v2}, Lorg/jasypt/web/pbeconfig/WebPBEInitializationContextListener;->class$(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lorg/jasypt/web/pbeconfig/WebPBEInitializationContextListener;->class$org$jasypt$web$pbeconfig$WebPBEInitializer:Ljava/lang/Class;

    :cond_28
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_5b

    new-instance v0, Lorg/jasypt/exceptions/EncryptionInitializationException;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "Class "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, " does not implement interface "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    sget-object p1, Lorg/jasypt/web/pbeconfig/WebPBEInitializationContextListener;->class$org$jasypt$web$pbeconfig$WebPBEInitializer:Ljava/lang/Class;

    if-nez p1, :cond_4c

    invoke-static {v2}, Lorg/jasypt/web/pbeconfig/WebPBEInitializationContextListener;->class$(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    sput-object p1, Lorg/jasypt/web/pbeconfig/WebPBEInitializationContextListener;->class$org$jasypt$web$pbeconfig$WebPBEInitializer:Ljava/lang/Class;

    :cond_4c
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5b
    :try_start_5b
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/jasypt/web/pbeconfig/WebPBEInitializer;
    :try_end_61
    .catch Ljava/lang/InstantiationException; {:try_start_5b .. :try_end_61} :catch_6c
    .catch Ljava/lang/IllegalAccessException; {:try_start_5b .. :try_end_61} :catch_65

    invoke-interface {p1}, Lorg/jasypt/web/pbeconfig/WebPBEInitializer;->initializeWebPBEConfigs()V

    return-void

    :catch_65
    move-exception p1

    new-instance v0, Lorg/jasypt/exceptions/EncryptionInitializationException;

    invoke-direct {v0, p1}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_6c
    move-exception p1

    new-instance v0, Lorg/jasypt/exceptions/EncryptionInitializationException;

    invoke-direct {v0, p1}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_73
    move-exception p1

    new-instance v0, Lorg/jasypt/exceptions/EncryptionInitializationException;

    invoke-direct {v0, p1}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_7a
    new-instance p1, Lorg/jasypt/exceptions/EncryptionInitializationException;

    const-string v0, "webPBEInitializerClassName context initialization parameter not set in web.xml"

    invoke-direct {p1, v0}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
