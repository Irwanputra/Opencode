.class public Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public header:Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;

    invoke-direct {v0}, Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;-><init>()V

    iput-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;->header:Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;

    return-void
.end method


# virtual methods
.method public getHeader()Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;->header:Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;

    return-object v0
.end method

.method public setHeader(Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;->header:Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "TcpSettingsBean{header="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;->header:Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
