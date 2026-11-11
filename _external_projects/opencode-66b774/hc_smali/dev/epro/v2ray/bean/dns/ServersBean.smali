.class public Ldev/epro/v2ray/bean/dns/ServersBean;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public address:Ljava/lang/String;

.field public domains:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public port:I


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/List;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldev/epro/v2ray/bean/dns/ServersBean;->address:Ljava/lang/String;

    iput p2, p0, Ldev/epro/v2ray/bean/dns/ServersBean;->port:I

    iput-object p3, p0, Ldev/epro/v2ray/bean/dns/ServersBean;->domains:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getAddress()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/dns/ServersBean;->address:Ljava/lang/String;

    return-object v0
.end method

.method public getDomains()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldev/epro/v2ray/bean/dns/ServersBean;->domains:Ljava/util/List;

    return-object v0
.end method

.method public getPort()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/bean/dns/ServersBean;->port:I

    return v0
.end method

.method public setAddress(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/dns/ServersBean;->address:Ljava/lang/String;

    return-void
.end method

.method public setDomains(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldev/epro/v2ray/bean/dns/ServersBean;->domains:Ljava/util/List;

    return-void
.end method

.method public setPort(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/bean/dns/ServersBean;->port:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "ServersBean{address=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/bean/dns/ServersBean;->address:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", port="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Ldev/epro/v2ray/bean/dns/ServersBean;->port:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", domains="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/dns/ServersBean;->domains:Ljava/util/List;

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぁごぐすすぃ(Ljava/lang/StringBuilder;Ljava/util/List;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
