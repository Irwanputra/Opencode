.class public final Lorg/jasypt/web/pbeconfig/WebPBEConfigFilter;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljavax/servlet/Filter;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public destroy()V
    .registers 1

    return-void
.end method

.method public doFilter(Ljavax/servlet/ServletRequest;Ljavax/servlet/ServletResponse;Ljavax/servlet/FilterChain;)V
    .registers 5

    invoke-static {}, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->getInstance()Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->isWebConfigurationDone()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {p3, p1, p2}, Ljavax/servlet/FilterChain;->doFilter(Ljavax/servlet/ServletRequest;Ljavax/servlet/ServletResponse;)V

    goto :goto_1c

    :cond_e
    invoke-interface {p2}, Ljavax/servlet/ServletResponse;->getWriter()Ljava/io/PrintWriter;

    move-result-object p1

    invoke-static {}, Lorg/jasypt/web/pbeconfig/WebPBEConfigHtmlUtils;->createNotInitializedHtml()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->write(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/PrintWriter;->flush()V

    :goto_1c
    return-void
.end method

.method public init(Ljavax/servlet/FilterConfig;)V
    .registers 2

    return-void
.end method
