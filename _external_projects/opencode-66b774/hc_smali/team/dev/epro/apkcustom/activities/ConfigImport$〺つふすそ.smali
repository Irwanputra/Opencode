.class public Lteam/dev/epro/apkcustom/activities/ConfigImport$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/おぐぴう〸ず/〺つふすそ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/activities/ConfigImport;->ぺぁあねじ(ILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/ConfigImport;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/activities/ConfigImport;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/ConfigImport$〺つふすそ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/ConfigImport;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ()V
    .registers 3

    const-wide/16 v0, 0x7d0

    :try_start_2
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_5} :catch_5

    :catch_5
    return-void
.end method

.method public げつ〴ぬぐ()V
    .registers 2

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/ConfigImport$〺つふすそ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/ConfigImport;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method
