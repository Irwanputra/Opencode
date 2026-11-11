.class public Ldev/epro/v2ray/bean/outbounds/MuxBean;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public enabled:Z


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isEnabled()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/bean/outbounds/MuxBean;->enabled:Z

    return v0
.end method

.method public setEnabled(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/bean/outbounds/MuxBean;->enabled:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "MuxBean{enabled="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ldev/epro/v2ray/bean/outbounds/MuxBean;->enabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
