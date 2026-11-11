.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/のぷのちつ/くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/のぷのちつ/げつ〴ぬぐ;


# instance fields
.field public 〺つふすそ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/のぷのちつ/げつ〴ぬぐ;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .registers 5

    iget-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/のぷのちつ/くし〴〺ぅ;->〺つふすそ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/のぷのちつ/げつ〴ぬぐ;

    if-eqz p1, :cond_9

    const/4 p2, -0x1

    const/4 p4, 0x0

    invoke-interface {p1, p2, p4, p3, p4}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    return-void
.end method
