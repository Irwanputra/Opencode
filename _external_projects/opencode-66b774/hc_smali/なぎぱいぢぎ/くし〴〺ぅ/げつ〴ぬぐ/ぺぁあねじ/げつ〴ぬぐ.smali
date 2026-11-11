.class public Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 〺つふすそ:Landroid/content/Context;

.field public final synthetic くし〴〺ぅ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/〺つふすそ$げつ〴ぬぐ;Landroid/content/Context;Ljava/lang/String;)V
    .registers 4

    iput-object p2, p0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/げつ〴ぬぐ;->〺つふすそ:Landroid/content/Context;

    iput-object p3, p0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 4

    new-instance p1, Landroid/content/Intent;

    iget-object v0, p0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/げつ〴ぬぐ;->〺つふすそ:Landroid/content/Context;

    const-class v1, Lcom/balsikandar/crashreporter/ui/LogMessageActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v0, p0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/String;

    const-string v1, "LogMessage"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/げつ〴ぬぐ;->〺つふすそ:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
