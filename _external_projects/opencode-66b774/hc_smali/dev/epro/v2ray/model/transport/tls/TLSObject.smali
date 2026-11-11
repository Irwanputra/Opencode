.class public Ldev/epro/v2ray/model/transport/tls/TLSObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public allowInsecure:Z

.field public allowInsecureCiphers:Z

.field public alpn:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public certificates:Ldev/epro/v2ray/model/transport/tls/CertificateObject;

.field public disableSystemRoot:Z

.field public serverName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAllowInsecure()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/model/transport/tls/TLSObject;->allowInsecure:Z

    return v0
.end method

.method public getAllowInsecureCiphers()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/model/transport/tls/TLSObject;->allowInsecureCiphers:Z

    return v0
.end method

.method public getAlpn()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/tls/TLSObject;->alpn:Ljava/util/List;

    return-object v0
.end method

.method public getCertificates()Ldev/epro/v2ray/model/transport/tls/CertificateObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/tls/TLSObject;->certificates:Ldev/epro/v2ray/model/transport/tls/CertificateObject;

    return-object v0
.end method

.method public getDisableSystemRoot()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/model/transport/tls/TLSObject;->disableSystemRoot:Z

    return v0
.end method

.method public getServerName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/tls/TLSObject;->serverName:Ljava/lang/String;

    return-object v0
.end method

.method public setAllowInsecure(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/model/transport/tls/TLSObject;->allowInsecure:Z

    return-void
.end method

.method public setAllowInsecureCiphers(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/model/transport/tls/TLSObject;->allowInsecureCiphers:Z

    return-void
.end method

.method public setAlpn(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/tls/TLSObject;->alpn:Ljava/util/List;

    return-void
.end method

.method public setCertificates(Ldev/epro/v2ray/model/transport/tls/CertificateObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/tls/TLSObject;->certificates:Ldev/epro/v2ray/model/transport/tls/CertificateObject;

    return-void
.end method

.method public setDisableSystemRoot(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/model/transport/tls/TLSObject;->disableSystemRoot:Z

    return-void
.end method

.method public setServerName(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/tls/TLSObject;->serverName:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "TLSObject{serverName=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/tls/TLSObject;->serverName:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", alpn="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/tls/TLSObject;->alpn:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", allowInsecure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ldev/epro/v2ray/model/transport/tls/TLSObject;->allowInsecure:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", allowInsecureCiphers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ldev/epro/v2ray/model/transport/tls/TLSObject;->allowInsecureCiphers:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", disableSystemRoot="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ldev/epro/v2ray/model/transport/tls/TLSObject;->disableSystemRoot:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", certificates="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/tls/TLSObject;->certificates:Ldev/epro/v2ray/model/transport/tls/CertificateObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
