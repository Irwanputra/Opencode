.class public Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;
.super Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;
.source ""


# static fields
.field public static volatile くし〴〺ぅ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;


# instance fields
.field public 〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

.field public げつ〴ぬぐ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;-><init>()V

    new-instance v0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    invoke-direct {v0}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;-><init>()V

    iput-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

    iput-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

    return-void
.end method

.method public static 〺つふすそ()Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;
    .registers 2

    sget-object v0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;

    if-eqz v0, :cond_7

    sget-object v0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;

    return-object v0

    :cond_7
    const-class v0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;

    monitor-enter v0

    :try_start_a
    sget-object v1, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;

    if-nez v1, :cond_15

    new-instance v1, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-direct {v1}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;-><init>()V

    sput-object v1, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;

    :cond_15
    monitor-exit v0
    :try_end_16
    .catchall {:try_start_a .. :try_end_16} :catchall_19

    sget-object v0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;

    return-object v0

    :catchall_19
    move-exception v1

    :try_start_1a
    monitor-exit v0
    :try_end_1b
    .catchall {:try_start_1a .. :try_end_1b} :catchall_19

    throw v1
.end method


# virtual methods
.method public げつ〴ぬぐ()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

    invoke-virtual {v0}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;->げつ〴ぬぐ()Z

    move-result v0

    return v0
.end method
